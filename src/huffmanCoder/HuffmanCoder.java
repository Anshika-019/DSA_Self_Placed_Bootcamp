//package huffmanCoder;
//
//import heaps.Heap;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class HuffmanCoder {
//    HashMap<Character, String> encoder;
//    HashMap<String, Character> decoder;
//
//    private class Node implements Comparable<Node> {
//       Character data;
//       int cost; // frequency
//        Node left;
//        Node right;
//
//        public Node(char character, int frequency) {
//            this.data = data;
//            this.cost = cost;
//            this.left = null;
//            this.right = null;
//        }
//
//        @Override
//        public int compareTo(Node other) {
//            return this.cost - other.cost;
//        }
//    }
//
//    public HuffmanCoder(String feeder) throws Exception {
//        HashMap<Character, Integer> fmap = new HashMap<>();
//
//        for (int i = 0; i < feeder.length(); i++) {
//            char ch = feeder.charAt(i);
//            // if the character is already present in the map, increment its frequency
//            // otherwise, add it to the map with frequency 1
//            if (fmap.containsKey(ch)) {
//                fmap.put(ch, fmap.get(ch) + 1);
//            } else {
//                fmap.put(ch, 1);
//            }
//        }
//
//        Heap<Node> minHeap = new Heap<>();
//        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();
//        // iterate through the map and create a node for each character
//        for (Map.Entry<Character, Integer> entry : entrySet) {
//            Node node = new Node(entry.getKey(), entry.getValue());
//            minHeap.insert(node);
//        }
//        while (minHeap.size() != 1) {
//            Node left = minHeap.remove();
//            Node right = minHeap.remove();
//            Node parent = new Node('\0', left.cost + right.cost);
//            parent.left = left;
//            parent.right = right;
//            minHeap.insert(parent);
//        }
//
//        Node root = minHeap.remove();
//
//        encoder = new HashMap<>();
//        decoder = new HashMap<>();
//        // create the encoder and decoder maps
//        createEncoderDecoder(root, "");
//
//
//
//    }
//
//    private void createEncoderDecoder(Node node, String code) {
//        if (node == null) {
//            return;
//        }
//        if (node.left == null && node.right == null) {
//            encoder.put(node.data, code);
//            decoder.put(code, node.data);
//            return;
//        }
//        createEncoderDecoder(node.left, code + "0");
//        createEncoderDecoder(node.right, code + "1");
//
//    }
//
//    public String encode(String data) {
//        StringBuilder encodedString = new StringBuilder();
//        for (int i = 0; i < data.length(); i++) {
//            char ch = data.charAt(i);
//            encodedString.append(encoder.get(ch));
//        }
//        return encodedString.toString();
//    }
//
//    public String decode(String data) {
//        StringBuilder decodedString = new StringBuilder();
//        String temp = "";
//        for (int i = 0; i < data.length(); i++) {
//            temp += data.charAt(i);
//            if (decoder.containsKey(temp)) {
//                decodedString.append(decoder.get(temp));
//                temp = "";
//            }
//        }
//        return decodedString.toString();
//    }
//}

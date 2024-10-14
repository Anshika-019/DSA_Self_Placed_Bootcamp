package arrayRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        int target = 5;
        System.out.println(linearSearch(arr, 0, target));
        System.out.println(linearSearch1(arr, 0, target));
        System.out.println(findIndexLast(arr, arr.length - 1, target));
//        findIndexLast1(arr, 0, target);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ans = findAllIndex(arr, 0, target, list);
        System.out.println(ans);
        System.out.println(list);

    }

    static int linearSearch(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return linearSearch(arr, idx + 1, target);
    }

    static boolean linearSearch1(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        }
        return linearSearch1(arr, idx + 1, target);
    }

    static int findIndexLast(int[] arr, int idx, int target) {
        if (idx == -1) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        } else {
            return findIndexLast(arr, idx - 1, target);
        }
    }

    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void findIndexLast1(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == target) {
            list.add(idx);
        } else {
            findIndexLast(arr, idx + 1, target);
        }
    }

    static ArrayList findIndexLast2(int[] arr, int idx, int target, ArrayList<Integer> list) {
        if (idx == arr.length) {
            return list;
        }
        if (arr[idx] == target) {
            list.add(idx);
        } else {
            findIndexLast(arr, idx + 1, target);
        }
        return null;
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int idx, int target, ArrayList<Integer> list) {
        if (idx == arr.length) {
            return list;
        }
        if (arr[idx] == target) {
            list.add(idx);
        }
        return findAllIndex(arr, idx + 1, target, list);

    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int idx, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (idx == arr.length) {
            return list;
        }

        //this will contain answer for that function call only
        if (arr[idx] == target) {
            list.add(idx);
        }
        ArrayList<Integer> ans = findAllIndex(arr, idx + 1, target, list);
        return ans;
    }


}

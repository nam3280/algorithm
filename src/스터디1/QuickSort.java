package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        quickSort(arr, 0, N - 1);

        for (int i : arr)
            System.out.print(i + " ");
    }

    // 재귀 함수
    // 피벗을 기준으로 배열을 왼쪽, 오른쪽 재귀로 정렬
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {

            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    // 피벗을 기준으로 배열을 나누는 부분
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // 배열의 맨 오른쪽 값을 피벗으로 한다.
        int i = left - 1; // 피벗보다 작은 값의 인덱스

        // 피벗보다 작은 값이 발견되면 피벗과 스왑
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);

        return i + 1;
    }

    // 피벗과 스왑
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

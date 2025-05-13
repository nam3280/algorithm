package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        mergeSort(arr, 0, N - 1);

        for (int answer : arr)
            System.out.print(answer + " ");
    }


    //재귀 함수
    //왼쪽과 오른쪽이 각각 크기가 mid가 될 때 까지 머지를한 뒤에 마지막에 머지
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        // 머지
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        // 왼쪽 배열에 남은 요소들
        while (i <= mid)
            temp[k++] = arr[i++];

        // 오른쪽 배열에 남은 요소들
        while (j <= right)
            temp[k++] = arr[j++];

        // 병합된 배열을 원래 배열에 저장
        for (int t = 0; t < temp.length; t++)
            arr[left + t] = temp[t];
    }
}

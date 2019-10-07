package com.exam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class RandomSeatEx {

	public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[] {
                "권현우", "김강호", "김기태", "김명한", "김서영",
                "김선우", "김영주", "김예지", "김정엽", "김지훈",
                "김태오", "김현주", "남동호", "박승재", "서영상",
                "안재영", "위재혁", "윤형식", "이다정", "이영민",
                "임주영", "임채빈", "정지훈", "최윤설"
        });

		Random random = new Random();
		Set<Integer> set = new LinkedHashSet<>();

		while (true) {
			if (set.size() == list.size()) {
				break;
			}
			int num = random.nextInt(list.size()) + 1; // (0~23) + 1 -> (1~24)
			set.add(num);
		}

		Map<String, Integer> nameNumberMap = new TreeMap<>();
		Map<Integer, String> numberNameMap = new TreeMap<>();
		int index = 0;
		for (int n : set) {
			// System.out.print(n + " ");
			nameNumberMap.put(list.get(index), n);
			numberNameMap.put(n, list.get(index));
			index++;
		}
		System.out.println();
		System.out.println("set.size() : " + set.size());

		System.out.println("\n========= 이름 순 출력 =========");

		Set<String> nameSet = nameNumberMap.keySet();
		for (String name : nameSet) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int number = nameNumberMap.get(name);
			System.out.println(name + " : " + number);
		}

		System.out.println("\n========= 번호 순 출력 =========");

		int count = 1;
		Set<Integer> numberSet = numberNameMap.keySet();
		for (int number : numberSet) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String name = numberNameMap.get(number);
			System.out.print(String.format("%02d", number) + ": " + name + "  ");

			if (count % 6 == 0) {
				System.out.println();
			}
			count++;
		}

		System.out.println("\n========= 완료 =========");
	} // main method

}

//COUNT THE NUMBER OF OCCURENCES OF EACH ELEMENT IN THE LIST

package com.ruyjfs.data_structure.response;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@Log4j2
public class NumbersResponse {

	public static void main(String[] args) {
		Integer[] numbers = {1, 1, 9, 2, 8, 4, 4, 7, 2, 4, 7, 0};
		run(numbers);
	}

	static void run(Integer[] numbers) {
		// Solução 1
		List<Integer> numbersDistinc = Arrays.stream(numbers).distinct().sorted().collect(Collectors.toList());
		numbersDistinc.forEach(number -> {
			long count = Arrays.stream(numbers).filter(n -> n.equals(number)).count();
//			log.info("number: {} occurences: {}", number, count);
			System.out.println("number: " + number + " occurences: " + count);
		});

		// Solução 2
//		Map<Integer, Integer> occurrences = new HashMap<>();
//		for (Integer number : numbers) {
//			occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
//		}
//		for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
//			System.out.println("Number: " + entry.getKey() + " Occurrences: " + entry.getValue());
//		}
	}
}

// number: 0 occurences: 1
// number: 4 occurences: 3
// number: 2 occurences: 2
// number: 1 occurences: 2
// number: 7 occurences: 2
// number: 8 occurences: 1
// number: 9 occurences: 1
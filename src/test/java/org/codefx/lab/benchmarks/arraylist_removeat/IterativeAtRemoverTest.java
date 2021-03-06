package org.codefx.lab.benchmarks.arraylist_removeat;

import org.junit.jupiter.api.Nested;

import java.util.ArrayList;
import java.util.List;

class IterativeAtRemoverTest extends RemoverTest {

	@Override
	<T> List<T> createEmptyList() {
		return new ArrayList<>();
	}

	@Override
	<T> List<T> remove(List<T> list, int[] removeAts) {
		return IterativeAtRemover.remove(list, removeAts);
	}

	@Nested class EmptyList extends _EmptyList { }
	@Nested class SingleElementList extends _SingleElementList {}
	@Nested class ThreeElementList extends _ThreeElementList {}
	@Nested class FiveElementList extends _FiveElementList {}

}

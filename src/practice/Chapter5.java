package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Chapter5 {
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		// タスクをリストに追加
		taskList.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		taskList.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談"));
		taskList.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
		taskList.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
		taskList.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

		// 日付順にソート
		Collections.sort(taskList, Comparator.comparing(Task::getDate));

		// タスクを日付順に表示
		for (Task task : taskList) {
			System.out.println(task);
		}
	}
}
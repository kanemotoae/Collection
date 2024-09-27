package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String description;

	// コンストラクタ
	public Task(LocalDate date, String description) {
		this.date = date;
		this.description = description;
	}

	// Getterメソッド
	public LocalDate getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return date + ": " + description;
	}
}
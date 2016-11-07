import java.io.*;

public class CopyFile {
	FileInputStream fin; // Храним файл для чтения
	PrintWriter writer; // Храним файл для записи

	public CopyFile(String[] args) throws IOException { 
		try { 
			try { // Открытие файла для чтения
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				InOut.outLn("Файл для ввода не найден");
				return;
			}
			try { // Открытие файла для вывода
				writer = new PrintWriter(args[1], "UTF-8");
			} catch (FileNotFoundException e) {
				InOut.outLn("Файл для выводна не найден");
				fin.close();
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			InOut.outLn("Использование: CopyFile исходный целевой");
			return;
		}
	}

	public void working() { // Расчёт физических характеристик аудио файла
		int readFileBit;
		int E = 0; // Энергия
		try {
			do {
				readFileBit = fin.read();
				if (readFileBit != -1)
					E += readFileBit * readFileBit;
			} while (readFileBit != -1);
			writer.println("E = " + E);
		} catch (IOException e) {
			InOut.outLn("Ошибка файла");
		}
	}

	public void Close() throws IOException { // Для очистки потоков
		fin.close();
		writer.close();
	}
}

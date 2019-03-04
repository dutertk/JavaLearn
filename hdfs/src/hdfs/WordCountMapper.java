package hdfs;

public class WordCountMapper implements Mapper {

	@Override
	public void Mapper(String line, Context context) {
		String[] strings = line.split(" ");
		for (String str : strings) {
			Object value = context.get(str);
			if ( null== value) {
				context.write(str, 1);
			} else {
				int num = (int) context.get(str);
				context.write(str, num + 1);
			}

		}

	}

}

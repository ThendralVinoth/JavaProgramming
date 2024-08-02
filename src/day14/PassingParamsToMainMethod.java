package day14;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
	
		System.out.println(args.length); // right click,  select run configuration, arguments, type data,run
		
		for(String value:args)
		{
			System.out.println(value);
		}

	}

}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Runner
{
    public static void main(String[] args)
    {
        final String FILE_NAME="src/in.csv";
        final String PLUS=" + ";
        final String MINUS=" - ";
        final String MARK_MINUS="-";
        final String RESULT_STRING_START="Result(";
        final String RESULT_STRING_END=") = ";
        final String SEPARATOR=";";
        final String ERROR_LINE="Error-line = ";
        final String FILE_NOT_FOUND="File not found";
        final String NOTING="";

        List<Double> numbers=new ArrayList<>();
        int errorRow=0;


        try
        {
            Scanner scanner=new Scanner(new FileReader(FILE_NAME));
            String stringRead;

            while (scanner.hasNext())
            {
                stringRead=scanner.nextLine();
                String[] stringReads=stringRead.split(SEPARATOR);
                try
                {
                    int index=Integer.parseInt(stringReads[0].trim());
                    double number=Double.parseDouble(stringReads[index].trim());
                    numbers.add(number);

                }
                catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
                {
                    errorRow++;// counter row with error in file

                }
            }

            StringBuilder stringResult=new StringBuilder();
            double result=0;

            for (double number : numbers)
            {
                if (number>=0)
                {
                    stringResult.append(PLUS + number);
                }
                else
                {
                    stringResult.append(MINUS + Math.abs(number));
                }
                result+=number;
            }

            if(numbers.size()>0 && numbers.get(0)<0)
            {
                stringResult.replace(0,MINUS.length(),MARK_MINUS);
            }
            else
            {
                stringResult.replace(0,PLUS.length(),NOTING);
            }

            System.out.println(RESULT_STRING_START+ stringResult.toString()+RESULT_STRING_END+result);
            System.out.println(ERROR_LINE+errorRow);
        }
        catch (FileNotFoundException e)
        {
            System.err.println(FILE_NOT_FOUND);
        }

    }
}

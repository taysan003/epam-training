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

        try
        {
            Scanner scanner=new Scanner(new FileReader(FILE_NAME));
            StringBuilder stringResult=new StringBuilder();
            double result=0;
            int errorRow=0;

            while (scanner.hasNext())
            {
                String stringRead=scanner.nextLine();
                String[] stringReads=stringRead.split(SEPARATOR);
                try
                {
                    int index=Integer.parseInt(stringReads[0].trim());
                    double number=Double.parseDouble(stringReads[index].trim());
                    if (number>=0)
                    {
                        stringResult.append(PLUS)
                                .append(number);
                    }
                    else
                    {
                        stringResult.append(MINUS)
                                .append(Math.abs(number));
                    }
                    result+=number;


                }
                catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
                {
                    errorRow++;// counter row with error in file

                }
            }

            if(stringResult.toString().startsWith(MINUS))
            {
                stringResult.replace(0,MINUS.length(),MARK_MINUS);
            }
            if(stringResult.toString().startsWith(PLUS))
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

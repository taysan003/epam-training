import java.security.Key;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner
{
    public static void main(String[] args)
    {
        final String FILE_NAME="in";
        final String SEPARATOR=";";
        final String VALUE="value";
        final String ERROR_LINE="Error-line = ";
        final String PATTERN_IS_INDEX="(\\s)*index.*";
        final String PATTERN_FOR_INDEX_INDEX="(\\s)*(index)([1-9][0-9]*)$";
        final String PATTERN_FOR_INDEX_VALUE="([1-9][0-9]*)";

        int badRow=0;
        double result=0;
        StringBuilder valueNumber=new StringBuilder();



        Pattern patternIndex=Pattern.compile(PATTERN_FOR_INDEX_INDEX);
        Pattern patternValue=Pattern.compile(PATTERN_FOR_INDEX_VALUE);
        Pattern patternIsIndex=Pattern.compile(PATTERN_IS_INDEX);

        ResourceBundle resourceBundle=ResourceBundle.getBundle(FILE_NAME);
        Enumeration<String> keys=resourceBundle.getKeys();



        while (keys.hasMoreElements())
        {
            String key=keys.nextElement();
            Matcher matcherIsIndex=patternIsIndex.matcher(key);
            if (matcherIsIndex.matches())
            {
                Matcher matcherIndex=patternIndex.matcher(key);
                if(matcherIndex.matches())
                {
                    String value=resourceBundle.getString(key).trim();
                    Matcher matcherIndexValue=patternValue.matcher(value);
                    if (matcherIndexValue.matches())
                    {
                        valueNumber.append(matcherIndex.group(3))
                                .append(matcherIndexValue.group(1))
                                .append(SEPARATOR);
                    }
                    else
                    {
                        badRow++;//counter bar row in properties file
                    }
                }
                else
                {
                    badRow++;
                }
            }

        }
        for(String valueIndex:valueNumber.toString().split(SEPARATOR))
        {
            try
            {
                String valueString=resourceBundle.getString(VALUE+valueIndex).trim();

                result+=Double.parseDouble(valueString);
            }
            catch (NumberFormatException | MissingResourceException e)
            {
                badRow++;
            }

        }
        System.out.format(Locale.ENGLISH,"Sum = %1.3f\n", result);
        System.out.println(ERROR_LINE+badRow);
    }
}

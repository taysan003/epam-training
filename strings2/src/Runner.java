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
        final String PATTERN_FOR_INDEX="(.*)(index)([1-9][0-9]*)$";
        final String PATTERN_FOR_INDEX_VALUE="([1-9][0-9]*)";
        final String PATTERN_IS_INDEX=".*index.*";
        final String PATTERN_IS_VALUE=".*values.*";

        int badRow=0;
        StringBuilder valueNumber=new StringBuilder();
        StringBuilder valueString=new StringBuilder();


        Pattern patternIndex=Pattern.compile(PATTERN_FOR_INDEX);
        Pattern patternValue=Pattern.compile(PATTERN_FOR_INDEX_VALUE);
        Pattern patternIsIndex=Pattern.compile(PATTERN_IS_INDEX);
        Pattern isValue=Pattern.compile(PATTERN_IS_VALUE);

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
                        badRow++;
                    }
                }
                else
                {
                    badRow++;
                }
            }


        }

        System.out.println(valueNumber.toString());
        System.out.println(badRow);
    }
}

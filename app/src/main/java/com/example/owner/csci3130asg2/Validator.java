package com.example.owner.csci3130asg2;

import java.util.regex.Pattern;

public class Validator {

    public int validation(String s)
    {
        int count = 0;

        if (s.equalsIgnoreCase("password"))
        {
            count++;
        }

        if (s.length() < 8)
        {
            count++;
        }

        if (!s.contains("!") && !s.contains("@") && !s.contains(".") && !s.contains("?"))
        {
            count++;
        }

        if (s.length() > 20)
        {
            count++;
        }

        if (!stringContainsNumber(s))
        {
            count++;
        }

        return count;

    }

    public boolean stringContainsNumber( String s )
    {
        return Pattern.compile( "[0-9]" ).matcher( s ).find();
    }

}

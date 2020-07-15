package hackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLReader {



    public static void main(String[] args) {

        String[] lines ={
                        "<h1>some</h1>",
                        "<h1>had<h1>public</h1></h1>",
                        "<h1>had<h1>public</h1515></h1>",
                        "<h1><h1></h1></h1>",
                        "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<",
                        ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",
                        "<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>",
                        "<>hello</>",
                        "<>hello</><h>dim</h>",
                        "<>hello</><h>dim</h>>>>>"
                    };
        for (String line:
             lines) {

            int pointer = 0;
            boolean matchFound = false;
            while(pointer < line.length()) {
                int tagStart=0;
                int tagEnd=0;
                String stopperTag = "";
                String starterTag = "";
                String contex = "";
                while (pointer < line.length() && line.charAt(pointer++) != '<') {
                }
                tagStart = pointer;
                while (pointer < line.length() && line.charAt(pointer++) != '>') {
                }

                tagEnd = pointer-1 ;
                if(tagStart-tagEnd>=0) continue;
                starterTag = line.substring(tagStart, tagEnd);
                stopperTag = "</"+starterTag+">";

                if (starterTag.length()>0&&line.substring(pointer).contains(stopperTag) ){
                    int stopperIndex = line.substring(pointer).indexOf(stopperTag)+pointer;
                    if(line.substring(pointer,stopperIndex).contains("<")&&line.substring(pointer,stopperIndex).length()>0){
                        continue;
                    }else{
                        contex = line.substring(pointer, stopperIndex);
                    }

                    if (contex.length() > 0) {
                        System.out.println(contex);
                        matchFound = true;
                    }

                }

            }
            if (matchFound == false) System.out.println("None");
        }
    }
}
/*

Expected Output:

some
public
None
None
None
None
None
None
dim
dim
*/

import java.util.*;
public class nameSearch{
public static void main(String[] args){
String text="I like to move it Alex move alex Alex it Apple Alex Alex";
String myName="Alex";
System.out.println(searchName(text, myName));
}






public static ArrayList<String> searchName(String context, String name){
ArrayList<String> hits=new ArrayList<String>();
for(int i=0;i<context.length();i++){
  if(Character.toLowerCase(context.charAt(i))==Character.toLowerCase(name.charAt(0))){
    String txet=context.substring(i,i+name.length());
    String tmp="";
    if (txet.equalsIgnoreCase(name)){
      for(int j=0;j<name.length();j++){
        tmp=tmp+context.charAt(i);
        i++;
      }
      hits.add(tmp);
    }
  }
}
return hits;
}




}

import java.util.*;
public class nameSearch{
public static void main(String[] args){
String text="I like to move it Alex move alex Alex it Apple Alex Alex Alex Alex Alex";
String myName="Alex";
ArrayList<String> hits=new ArrayList<String>();
for(int i=0;i<text.length();i++){
  if(text.charAt(i)==myName.charAt(0)){
    String txet=text.substring(i,i+myName.length());
    String tmp="";
    if (txet.equals(myName)){
      for(int j=0;j<myName.length();j++){
        tmp=tmp+text.charAt(i);
        i++;
      }
      hits.add(tmp);
    }
  }
}
System.out.println(hits);


}
}

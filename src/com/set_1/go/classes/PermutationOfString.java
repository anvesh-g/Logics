package com.set_1.go.classes;

public class PermutationOfString {

    public static void main(String[] args) {
        new PermutationOfString().permute("xyz",0,2);
    }

    public void permute(String s,int index,int length){
        if(index==length){
            System.out.println(s);
        }else{
            for (int i=index; i<=length;i++){
                s=swap(s,index,i);
                permute(s,index+1,length);
                s=swap(s,index,i);
            }
        }
    }

    public String swap(String s, int index,int length){
        char[] sArr=s.toCharArray();
        char temp;
        temp=sArr[index];
        sArr[index]=sArr[length];
        sArr[length]=temp;
        return String.valueOf(sArr);
    }
}

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String ch: operations){
            if(ch.equals("+")){
                int a=st.pop();
                int b=st.peek();
                int sum=a+b;
                st.push(a);
                st.push(sum);
            }
            else if (ch.equals("D")){
                int prev=st.peek();
                int newScore=prev*2;
                st.push(newScore);
            }else if(ch.equals("C")){
                    st.pop();
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
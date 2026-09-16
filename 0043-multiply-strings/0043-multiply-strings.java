class Solution {

    public String multiply(String num1, String num2) {

        int n1 = num1.length();
        int n2 = num2.length();

        // If either number is 0
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        if(n1 < n2)
            return mult(num2, num1);

        return mult(num1, num2);
    }

    String mult(String m1, String m2) {

        int n1 = m1.length();
        int n2 = m2.length();

        String[] temp = new String[n2];

        for(int i = n2 - 1; i >= 0; i--) {

            StringBuilder sb = new StringBuilder();
            int carry = 0;
            for(int j = n1 - 1; j >= 0; j--) {
                int product =(m2.charAt(i) - '0') * (m1.charAt(j) - '0') + carry;
                sb.append(product % 10);
                carry = product / 10;
            }
            if(carry > 0)
                sb.append(carry);
            sb.reverse();
            for(int k = 0; k < n2 - 1 - i; k++)
                sb.append('0');
            temp[n2 - 1 - i] = sb.toString();
        }
        return add(temp);
    }
    String add(String[] temp) {
        String result = "0";
        for(String str : temp) {
            if(str != null)
                result = addTwo(result, str);
        }
        return result;
    }
    String addTwo(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
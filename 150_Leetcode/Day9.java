 public static boolean isSubsequencee(String s, String t) {
        int target = 0;
        int current_check = 0;
        while(current_check<t.length()){
            if(s.charAt(target)!=t.charAt(current_check)){
                current_check++;
            }else{
                target++;
                current_check++;
                 if(target == s.length()){
                 return true;
               }
                
            }
        }
        return false;
    }
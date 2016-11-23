 char [] twoBase = Integer.toBinaryString(n).toCharArray();
    int counter = 0;
    int max=0;

    for(char nums: twoBase){
        if(nums =='1'){
            counter++;   
        } else{

            counter=0;
        }
        if(max<counter)
            max = counter;
    }

    System.out.println(max);
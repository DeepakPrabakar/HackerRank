	// Add your code here
    Difference(int a[])
    {
        this.elements=a;
    }
    public void computeDifference()
    {
        for(int i=0;i<elements.length-1;i++)
        {
            for(int j=i+1;j<elements.length;j++)
            {
                int diff=Math.abs(elements[i]-elements[j]);
                if(diff>maximumDifference)maximumDifference=diff;
            }
            
        }
        
    }

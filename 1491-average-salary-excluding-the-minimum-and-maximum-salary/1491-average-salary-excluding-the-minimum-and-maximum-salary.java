class Solution {
    public double average(int[] salary) {
        ArrayList<Integer> li = new ArrayList<>();
        int max = salary[0];
        int min = salary[0];

        for (int i = 1; i < salary.length; i++) {
            max = Math.max(salary[i], max);
            min = Math.min(salary[i], min);

        }
        for (int j = 0; j < salary.length; j++) {
            if (salary[j] != max && salary[j] != min) {
                li.add(salary[j]);
            }
        }
        int avgsal = 0;
        for(int k=0;k<li.size();k++){
            avgsal+=li.get(k);
        }
        if(li.size() == 0){
            return 0;
        }

            return (double)avgsal/li.size();
    }
}
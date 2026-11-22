class ProductOfNumbers {
    ArrayList<Integer> li = new ArrayList<>();

    public ProductOfNumbers() {

    }

    public void add(int num) {
        li.add(num);
    }

    public int getProduct(int k) {
        int i = li.size()-1;
        int prod = 1;
        while(k != 0){
            prod = prod * li.get(i);
            i--;
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
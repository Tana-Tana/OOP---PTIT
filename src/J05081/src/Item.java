public class Item implements Comparable<Item> {
    private String number;
    private String name;
    private String unit;
    private long purchasePrice;
    private long sellingPrice;
    private long profit;

    public Item(String name, String unit, long purchasePrice, long sellingPrice) {
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.profit = this.sellingPrice - this.purchasePrice;
        this.number = "MH";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getProfit() {
        return profit;
    }

    @Override
    public int compareTo(Item item) {
        if(this.profit == item.getProfit()) {
            if(this.number.compareTo(item.getNumber()) < 0) {
                return -1;
            }
            else return 1;
        }
        else {
            if(this.profit > item.getProfit()) return -1;
            else return 1;
        }
    }

    @Override
    public String toString() {
        return this.number + " " + this.name + " " + this.unit + " " +
                String.valueOf(purchasePrice) + " " + String.valueOf(sellingPrice)
                + " " + String.valueOf(profit);
    }
}

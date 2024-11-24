public class MonHoc {
    private String id;
    private String name;
    private String infor;

    public MonHoc(String infor) {
        this.infor = infor;
    }

    public void XacDinhThongTin(){
        String[] nameString = this.infor.split("\\s+");
        this.id = nameString[0];
        this.name = "";
        for(int i =1;i<nameString.length;++i){
            this.name += nameString[i];
            if(i!= nameString.length-1) this.name += " ";
        }
    }
    public String getId() {
        return id;
    }

    public String getTenMon() {
        return name;
    }
}

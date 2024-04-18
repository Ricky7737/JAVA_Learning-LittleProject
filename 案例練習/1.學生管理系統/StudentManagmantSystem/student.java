package RealCase;

// 建立一個學生類別
public class student {
    // 屬性有 id、姓名、年齡、家庭地址
    private String id;
    private String name;
    private int age;
    private String address;

    // 建立空參數的建構子
    public student() {
    }

    // 建構子，設定屬性初始值
    public student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 建立 Javabean 屬性的 getter 和 setter 方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

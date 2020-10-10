package 第12节_枚举应用案例;

public enum Sex {
    MALE("男"),FEMALE("女");
    private String title;

    private Sex(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }

}

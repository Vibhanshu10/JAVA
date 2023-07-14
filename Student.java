 class Student {
    private String unv_name;
    private int roll_no;
    private String name;
    private int maths_score;
    private int java_score;
    private int eng_score;
    private double percentage;
    private char grade;
    public Student() {
    this.unv_name="DIT UNIVERSITY";
    }
    public Student(int roll_no, String name) {
    this(); // Constructor chaining
    this.name=name;
    this.roll_no=roll_no;
    }
    public int getRoll_no() {
    return roll_no;
    }
    public void setRoll_no(int roll_no) {
    this.roll_no = roll_no;
    }
    public int getJava_score() {
    return java_score;
    }
    public void setMaths_score(int maths_score) {
    this.maths_score = maths_score;
    }
    public int getMaths_score(){
        return maths_score;
        }
        public void setJava_score(int java_score) {
        this.java_score = java_score;
        }
        public int getEng_score() {
        return eng_score;
        }
        public void setEng_score(int eng_score) {
        this.eng_score = eng_score;
        }
        public double getPercentage() {
        return percentage;
        }
        public void setPercentage(double percentage) {
        this.percentage = percentage;
        }
        public char getGrade() {
        return grade;
        }
        public void setGrade(char grade) {
        this.grade = grade;
        }
        void cal_percentage() {
        percentage = ((eng_score + maths_score + java_score) /
        3);
        }
        void cal_grade() {
        if(percentage >= 90){
            grade = 'A';
            }
            else if(percentage >= 70 && percentage <90) {
            grade = 'B';
            }
            else if(percentage >= 60 && percentage <70) {
            grade = 'C';
            }
            else if(percentage >= 50 && percentage <60) {
            grade = 'D';
            }
            else {
            grade = 'F';
            }
            }
            void print_data() {
            System.out.println("-----------------------------");
            System.out.println("UNIVERSITY NAME -- "+unv_name);
            System.out.println("STUDENT NAME : "+name);
            System.out.println(name+" ROLL NO. : "+roll_no);
            System.out.println("PERCENTAGE OF "+name+":"+percentage);
            System.out.println("GRADE OF "+name+" :"+grade);
            }
            }
    
    
    
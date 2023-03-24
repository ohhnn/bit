package bit.basic.obj1;

public class ObjectEx3 {
	//이름,나이,오늘생일,성별,지역,띠,나이평균,나이별 정렬, 성씨별 인원수
	String []member = {"공지현#961010-1010678#051)234-5678",
					   "김가영#990910-1010678#051)234-5678",
					   "김민준#970710-1010678#051)234-5678",
					   "김병훈#960810-1010678#051)234-5678",
					   "박규민#950210-1010678#051)234-5678"};
	
	private String name;
	private int age;
	private String todaybd;
	private String sex;
	private String local;
	private String ddi;
	private double avg;
	private int older;
	private int lastnamenumbers;		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		this.email = email;
	}

	public int getCountValue() {
		return countValue;
	}

	public void setCountValue(int countValue) {
		this.countValue = countValue;
	}
	public static void main(String[] args) {
		ObjectEx3 o = new ObjectEx3();
		ObjectEx3 []m = new ObjectEx3[o.member.length];
		
		for ( int i=0; i<o.member.length; i++) {
			m[i] = new ObjectEx3();
			String[] str = o.member[i].split("#");
			m[i].
		}
	}

}

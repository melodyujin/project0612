class Star2{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			String star="";
			/*
			if(i%2==0){
				star="��"
			}else{
				star="��"
			}
			*/
			star=(i%2==0)? "��":"��";
			System.out.print(star);
		}
	}
}

class Star2{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			String star="";
			/*
			if(i%2==0){
				star="¡Ú"
			}else{
				star="¡Ù"
			}
			*/
			star=(i%2==0)? "¡Ú":"¡Ù";
			System.out.print(star);
		}
	}
}

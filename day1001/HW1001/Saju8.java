import java.util.Scanner;
class Saju8 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		String name, ddi;
		int month,day,time,index=0;
		System.out.println("이름을 입력하세요");
		name=sc.next();
		System.out.println("띠를 입력하세요");
		ddi=sc.next();
		

		if(ddi.equals("쥐띠")) index=0;
		if(ddi.equals("소띠")) index=1;
		if(ddi.equals("호랑이띠")) index=2;
		if(ddi.equals("토끼띠")) index=3;
		if(ddi.equals("용띠")) index=4;
		if(ddi.equals("뱀띠")) index=5;
		if(ddi.equals("말띠")) index=6;
		if(ddi.equals("양띠")) index=7;
		if(ddi.equals("원숭이띠")) index=8;
		if(ddi.equals("닭띠")) index=9;
		if(ddi.equals("개띠")) index=10;
		if(ddi.equals("돼지띠")) index=11;

		switch(index){
			case 0: System.out.println("천귀:귀한 몸을 뜻하며 자손이 귀한 집에 외동으로 태어나거나 어른이 된 후에 출세하여 높은 지위에 오르게 된다"); break;
			case 1: System.out.println("천액:어린 시절 몸에 상처가 있거나 커서 수술을 받을 수 있고, 공부를 많이 해서 지식이 풍부하고 전문적인 분야에 적성이 맞으며, 인생 중반 이후에 재물운과 관운이 들어 있다");break;
			case 2: System.out.println("천권:권력을 휘두르는 자리를 갖는다는 뜻으로 판사, 검사, 의사처럼 생사여탈권을 갖거나 정부 중요 직책, 학생을 가르치는 교육자처럼 권력을 갖고 살게 된다");break;
			case 3: System.out.println("천파:처음에는 여러 어려움인 갑작스러운 사고, 화재, 이혼등의 고비가 있을 수 있고 차츰 좋아지는 대기만성형이다");break;
			case 4: System.out.println("천인:크게 다치거나 수술 할 일이 생겨 몸에 흉터를 지니고 산다");break;
			case 5: System.out.println("천문:공부를 많이 해서 학식이 높은 것을 뜻하기도 하고, 두루두루 아는 것이 많은 박학다식을 뜻하기도 한다");break;
			case 6: System.out.println("천복:복을 타고 났다는 것을 뜻하며, 좋은 가정에서 태어나 많은 유산을 물려받거나 살다가 귀인을 만나 큰 복을 얻는다");break;
			case 7: System.out.println("천고:외로운 신세이며, 현실적으로 어려서 부모를 잃고 힘들게 자라거나 넉넉한 가정에 자랐지만 정신적으로 의지할 사람이 없는 외로운 경우이다");break;
			case 8: System.out.println("천역:역마살을 뜻하며, 한 곳에 머무르지 못하고 떠돌아 다닌다");break;
			case 9: System.out.println("천간:간사하고 사악하다는 뜻으로 색을 밝히며, 속마음을 쉽게 드러내지 않고 전반적인 대인 관계가 좋은 편이다");break;
			case 10: System.out.println("천수:손재주가 많다");break;
			case 11: System.out.println("천명:명이 길다");break;
        }
		System.out.println("생월을 입력하세요");
		month=sc.nextInt();
		index = (index + month -1)%12;
		switch(index){
			case 0: System.out.println("천귀:귀한 몸을 뜻하며 자손이 귀한 집에 외동으로 태어나거나 어른이 된 후에 출세하여 높은 지위에 오르게 된다"); break;
			case 1: System.out.println("천액:어린 시절 몸에 상처가 있거나 커서 수술을 받을 수 있고, 공부를 많이 해서 지식이 풍부하고 전문적인 분야에 적성이 맞으며, 인생 중반 이후에 재물운과 관운이 들어 있다");break;
			case 2: System.out.println("천권:권력을 휘두르는 자리를 갖는다는 뜻으로 판사, 검사, 의사처럼 생사여탈권을 갖거나 정부 중요 직책, 학생을 가르치는 교육자처럼 권력을 갖고 살게 된다");break;
			case 3: System.out.println("천파:처음에는 여러 어려움인 갑작스러운 사고, 화재, 이혼등의 고비가 있을 수 있고 차츰 좋아지는 대기만성형이다");break;
			case 4: System.out.println("천인:크게 다치거나 수술 할 일이 생겨 몸에 흉터를 지니고 산다");break;
			case 5: System.out.println("천문:공부를 많이 해서 학식이 높은 것을 뜻하기도 하고, 두루두루 아는 것이 많은 박학다식을 뜻하기도 한다");break;
			case 6: System.out.println("천복:복을 타고 났다는 것을 뜻하며, 좋은 가정에서 태어나 많은 유산을 물려받거나 살다가 귀인을 만나 큰 복을 얻는다");break;
			case 7: System.out.println("천고:외로운 신세이며, 현실적으로 어려서 부모를 잃고 힘들게 자라거나 넉넉한 가정에 자랐지만 정신적으로 의지할 사람이 없는 외로운 경우이다");break;
			case 8: System.out.println("천역:역마살을 뜻하며, 한 곳에 머무르지 못하고 떠돌아 다닌다");break;
			case 9: System.out.println("천간:간사하고 사악하다는 뜻으로 색을 밝히며, 속마음을 쉽게 드러내지 않고 전반적인 대인 관계가 좋은 편이다");break;
			case 10: System.out.println("천수:손재주가 많다");break;
			case 11: System.out.println("천명:명이 길다");break;
        }

		System.out.println("생일을 입력하세요");
		day=sc.nextInt();
        index = (index + day -1)%12;
		switch(index){
			case 0: System.out.println("천귀:귀한 몸을 뜻하며 자손이 귀한 집에 외동으로 태어나거나 어른이 된 후에 출세하여 높은 지위에 오르게 된다"); break;
			case 1: System.out.println("천액:어린 시절 몸에 상처가 있거나 커서 수술을 받을 수 있고, 공부를 많이 해서 지식이 풍부하고 전문적인 분야에 적성이 맞으며, 인생 중반 이후에 재물운과 관운이 들어 있다");break;
			case 2: System.out.println("천권:권력을 휘두르는 자리를 갖는다는 뜻으로 판사, 검사, 의사처럼 생사여탈권을 갖거나 정부 중요 직책, 학생을 가르치는 교육자처럼 권력을 갖고 살게 된다");break;
			case 3: System.out.println("천파:처음에는 여러 어려움인 갑작스러운 사고, 화재, 이혼등의 고비가 있을 수 있고 차츰 좋아지는 대기만성형이다");break;
			case 4: System.out.println("천인:크게 다치거나 수술 할 일이 생겨 몸에 흉터를 지니고 산다");break;
			case 5: System.out.println("천문:공부를 많이 해서 학식이 높은 것을 뜻하기도 하고, 두루두루 아는 것이 많은 박학다식을 뜻하기도 한다");break;
			case 6: System.out.println("천복:복을 타고 났다는 것을 뜻하며, 좋은 가정에서 태어나 많은 유산을 물려받거나 살다가 귀인을 만나 큰 복을 얻는다");break;
			case 7: System.out.println("천고:외로운 신세이며, 현실적으로 어려서 부모를 잃고 힘들게 자라거나 넉넉한 가정에 자랐지만 정신적으로 의지할 사람이 없는 외로운 경우이다");break;
			case 8: System.out.println("천역:역마살을 뜻하며, 한 곳에 머무르지 못하고 떠돌아 다닌다");break;
			case 9: System.out.println("천간:간사하고 사악하다는 뜻으로 색을 밝히며, 속마음을 쉽게 드러내지 않고 전반적인 대인 관계가 좋은 편이다");break;
			case 10: System.out.println("천수:손재주가 많다");break;
			case 11: System.out.println("천명:명이 길다");break;
        }
		
		System.out.println("1번  오후11시 30분~오전 1시 30분");
		System.out.println("2번  오전 1시 30분~오전 3시 30분");
		System.out.println("3번  오전 3시 30분~오전 5시 30분");
		System.out.println("4번  오전 5시 30분~오전 7시 30분");
		System.out.println("5번  오전 7시 30분~오전 9시 30분");
		System.out.println("6번  오전 9시 30분~오전 11시 30분");
		System.out.println("7번  오전11시 30분~오후 1시 30분");
		System.out.println("8번  오후 1시 30분~오후 3시 30분");
		System.out.println("9번  오후 3시 30분~오후 5시 30분");
		System.out.println("10번 오후 5시 30분~오후 7시 30분");
		System.out.println("11번 오후 7시 30분~오후 9시 30분");
		System.out.println("12번 오후 9시 30분~오후 11시 30분");
		System.out.print("당신의 생시가 몇 번에 해당하는지 입력하세요 : ");
		
		time=sc.nextInt();
        index = (index + time -1)%12;
		switch(index){
			case 0: System.out.println("천귀:귀한 몸을 뜻하며 자손이 귀한 집에 외동으로 태어나거나 어른이 된 후에 출세하여 높은 지위에 오르게 된다"); break;
			case 1: System.out.println("천액:어린 시절 몸에 상처가 있거나 커서 수술을 받을 수 있고, 공부를 많이 해서 지식이 풍부하고 전문적인 분야에 적성이 맞으며, 인생 중반 이후에 재물운과 관운이 들어 있다");break;
			case 2: System.out.println("천권:권력을 휘두르는 자리를 갖는다는 뜻으로 판사, 검사, 의사처럼 생사여탈권을 갖거나 정부 중요 직책, 학생을 가르치는 교육자처럼 권력을 갖고 살게 된다");break;
			case 3: System.out.println("천파:처음에는 여러 어려움인 갑작스러운 사고, 화재, 이혼등의 고비가 있을 수 있고 차츰 좋아지는 대기만성형이다");break;
			case 4: System.out.println("천인:크게 다치거나 수술 할 일이 생겨 몸에 흉터를 지니고 산다");break;
			case 5: System.out.println("천문:공부를 많이 해서 학식이 높은 것을 뜻하기도 하고, 두루두루 아는 것이 많은 박학다식을 뜻하기도 한다");break;
			case 6: System.out.println("천복:복을 타고 났다는 것을 뜻하며, 좋은 가정에서 태어나 많은 유산을 물려받거나 살다가 귀인을 만나 큰 복을 얻는다");break;
			case 7: System.out.println("천고:외로운 신세이며, 현실적으로 어려서 부모를 잃고 힘들게 자라거나 넉넉한 가정에 자랐지만 정신적으로 의지할 사람이 없는 외로운 경우이다");break;
			case 8: System.out.println("천역:역마살을 뜻하며, 한 곳에 머무르지 못하고 떠돌아 다닌다");break;
			case 9: System.out.println("천간:간사하고 사악하다는 뜻으로 색을 밝히며, 속마음을 쉽게 드러내지 않고 전반적인 대인 관계가 좋은 편이다");break;
			case 10: System.out.println("천수:손재주가 많다");break;
			case 11: System.out.println("천명:명이 길다");break;
        }



		}

	}


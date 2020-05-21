//attract 인터페이스
interface attract{

    public String getGift();//선물메서드
    public String getMessage();//고백멘트 메서드
    void ReplySuccess();//고백성공응답 메서드
    void ReplyFail();//고백실패 메서드

}

//소년 클래스 attract 인터페이스 상속
class Boy implements attract{
    private String gift;//선물 변수 은닉화
    private String message;//고백 멘트 변수 은닉화

    //선물접근 및 입력 메서드
    public void setGift(String gift){
        this.gift = gift;
    }

    //고백멘트 접근 및 입력 메서드
    public void setMessage(String message){
        this.message = message;
    }

    //선물 접근 및 값 가져오는 메서드
    public String getGift(){
        return gift;
    }

    //고백멘트 접근 및 값 가져오는 메서드
    public String getMessage(){
        return message;
    }

    //고백성공응답 메서드
    public void ReplySuccess(){
        System.out.println("그래, 용기내줘서 고마워");
    }

    //고백실패응답 메서드
    public void ReplyFail(){
        System.out.println("미안...부담스럽다. 친구로만 지내자");
    }

}

//소녀 클래스 attract 인터페이스 상속
class Girl implements attract{
    String gift;
    String message;

    public void setGift(String gift){
        this.gift = gift;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getGift(){
        return gift;
    }
    public String getMessage(){
        return message;
    }
    
    public void ReplySuccess(){
        System.out.println("고마워. 나도 같은 마음이었어");
    }
    public void ReplyFail(){
        System.out.println("아니 그냥 친구로 지내자...미안");
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("연예 시뮬레이션입니다.");
        
        //소년, 소녀 객체화
        Boy chozza = new Boy();
        Girl chulbyeok = new Girl();
        Boy gosu = new Boy();
        Girl geomsabba = new Girl();

        //남자의 고백 인스턴스화
        System.out.println("남자의 고백");
        chozza.setGift("현금");
        chozza.setMessage("너의 마음을 사려면 얼마면 돼?");
        System.out.println("여기 "+chozza.getGift()+"이야. "+chozza.getMessage());

        System.out.println("여자의 대답");
        chulbyeok.setGift("장미");
        chulbyeok.setMessage("사랑해");
        //고백멘트가 같거나 선물이 같을 시에 성공응답 메서드 호출
        if((chozza.getGift()==chulbyeok.getGift())||(chozza.getMessage()==chulbyeok.getMessage())){
            chulbyeok.ReplySuccess();
        }  
        else{
            chulbyeok.ReplyFail();
        }

        //여자의 고백 인스턴스화
        gosu.setGift("시계");
        gosu.setMessage("세상에서 네가 제일 멋져");
        geomsabba.setGift("지갑");
        System.out.println("여자의 고백");
        System.out.println("여기 "+geomsabba.getGift()+"이야. ");
        geomsabba.setMessage("세상에서 네가 제일 멋져");
        System.out.println(geomsabba.getMessage());

        //남자의 대답 \
        System.out.println("남자의 대답");
        //고백멘트가 같거나 선물이 같을 시에 성공응답 메서드 호출
        if((gosu.getGift()==geomsabba.getGift())||(gosu.getMessage()==geomsabba.getMessage())){
            gosu.ReplySuccess();
        }
        else{
            gosu.ReplyFail();
        }
    }
}
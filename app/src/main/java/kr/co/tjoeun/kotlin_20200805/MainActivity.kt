package kr.co.tjoeun.kotlin_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ctrl + / 해당 줄을 주석으로
//        메모처럼 주석을 적자
//        xml 에 그려운 clik me 버튼이 눌렸다는 것을 감지하고 싶다

        clickMeBtn.setonClickListener {it:View!
//        이 중괄호 내부의 코드 => clickMeBtn 이 눌리면 실행될 코드
            Log.d("버튼클릭","ClickME버튼 눌림!")

            Toast.makeText(this,"Click me 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

//        두번째 버튼이 눌릴때
        secondBtn.setOnClickListener {
            Log.d("버튼눌림","두번째 버튼 눌림!")

            Toast.makeText(this,"두번째 버튼 눌림!", Toast.LENGTH_SHORT).show()
        }
//        복사하기 버튼이 눌리면 할 일
        copyBtn.setOnClickListener {
//            Edt 에 입력된 내용을 받아와서 (임시저장)
            val inputMessage = messageEdt.text.toString()
//            Txt 에 문구로 반영
            copyResultTxt.text = inputMessage




        }


    }
}

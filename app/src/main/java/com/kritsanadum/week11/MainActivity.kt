package com.kritsanadum.week11

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        tv_header.text = "กรุณาเลือกสถานที่ท่องเที่ยว"
        tv_content.text = ""

        btn1.setOnClickListener {

            setResult("พระธาตุช่อแฮ","พระธาตุช่อแฮ พระธาตุประจำปีเกิดปีเสือ (ปีขาล) พระธาตุช่อแฮ เป็นพระธาตุ1 ใน12 ราศี คือ เป็นพระธาตุประจำปีเกิด สำหรับคน ที่เกิดปีเสือ (ปีขาล) หากนำผ้าแพรสามสีไปถวายจะทำให้ชีวิตมีพลังคุ้มครองป้องกันศัตรูได้ การสวดและไหว้ ให้เริ่มต้นนะโม 3 จบ แล้วสวดตามด้วยคาถาบูชาพระธาตุ 5 จบ พลังบารมีจะดลบันดาลให้มีชีวิตที่ดีขึ้น พระธาตุช่อแฮ หมายถึง เจดีย์บรรจุพระบรม สารีริกธาตุพระศอกซ้ายและพระเกศาธาตุของสมเด็จพระสัมมาสัมพุทธเจ้าและประดับบูชาด้วยผ้าแพรอย่างดี")

        }

        btn2.setOnClickListener {

            setResult("แพะเมืองผี","แพะเมืองผี จังหวัดแพร่ เกิดจากสภาพภูมิประเทศซึ่งเป็นดิน และหินทรายถูกกัดเซาะตามธรรมชาติเป็นรูปร่างลักษณะต่างๆ แพะแปลว่า ป่าละเมาะ")
        }

        btn3.setOnClickListener {

            setResult("ถ้ำผานางคอย","ถ้ำผานางคอย เป็นถ้ำที่มีมายาวนานแล้ว ถ้ำที่เกิดจากธรรมชาติมีลักษณะเป็นหน้าผาสูง ภายในถ้ำมีหินงอกหินย้อย มีก้อนหินรูปร่างคล้ายหญิงสาวนั่งอุ้มลูกน้อยรอคอยคนรัก ชาวบ้านเรียกหินก้อนนี้ว่า หินนางคอย มีตำนานพื้นบ้านที่เล่าต่อกันมาว่า เมื่อ 800 ปี อาณาจักรแสนหวีมีกษัตริย์องค์หนึ่ง ปกครองด้วยทศพิธราชธรรม พระองค์มีพระราชธิดาที่ทรงเลอโฉมนามว่า อรัญญาณี พระนางทรงมีพระทัยโอบอ้อมอารีย์ ในคราวหนึ่งพระนางทรงสำราญทางชลมาพร้อมด้วยข้าราชบริพาร เรือพระที่นั่งถูกพายุพัดกระหน่ำจมลง พวกข้าราชบริพารพากันหนีเอาตัวรอดตามลำพัง เว้นแต่คนองเดช หัวหน้าฝีพายหนุ่มได้เข้าช่วยพระนางไว้ทันและพาพระนางเข้าฝั่งอย่างปลอดภัย ด้วยความใกล้ชิดและสำนึกในบุญคุณในความจงรักภักดีที่ช่วยผยุงฝาอันตราย")
        }

    }

    fun setResult(header :String , content : String ){

        tv_header.text =  header
        tv_content.text = content
        if(header == "พระธาตุช่อแฮ"){

            img_show.setImageResource(R.drawable.pratadchohea)

        }else if(header == "แพะเมืองผี"){

            img_show.setImageResource(R.drawable.place2)

        }else if(header == "ถ้ำผานางคอย"){

            img_show.setImageResource(R.drawable.place3)

        }

    }

}

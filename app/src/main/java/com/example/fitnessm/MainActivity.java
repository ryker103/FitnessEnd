package com.example.fitnessm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    private TextView coutdowntext;
    private Button coutdownButton;
    private CountDownTimer countDownTimer;
    private long timeleft = 60000;
    private boolean timerunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }

    private ArrayList<Model> getMyList()
    {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Barbell bench press");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtngucduoitangang);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 85-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucngangtadon);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực giữa\n" +
                "Cơ liên quan: Vai, cơ tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle("Dumbell bench press");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avdnguctrentadon);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 85-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.nguctremau);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực trên\n" +
                "Cơ liên quan: Vai, cơ tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);



        m = new Model();
        m.setTitle("Dumbell fly");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtngucflyminhchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 70-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucflyy);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực trong\n" +
                "Cơ liên quan: Vai, cơ lưng, tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);


        m = new Model();
        m.setTitle("Machine fly");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtngucep);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 70-80% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.nguckeocapmau);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực\n" +
                "Cơ liên quan: Vai, cơ xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);


        /*m = new Model();
        m.setTitle("Machine Chest Press");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtngucmay);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucdaymay);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực\n" +
                "Cơ liên quan: Vai, tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);*/

///////////////////////////////////////////////////////////////////////////////////////////////////
        //vai
       /* m = new Model();
        m.setTitle("Shoulder Exercise");
        models.add(m);*/





        m = new Model();
        m.setTitle(" Seated Lateral raise");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtvai2ben);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 70-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaidumbellshoulderpress);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: vai\n" +
                "Cơ liên quan: Tay trước, Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle(" Seated Snath");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtvaitruocchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaitruoc);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);

        m = new Model();
        m.setTitle("Smith Machine Overhead");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtvaismithchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 60-70% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 50-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaismith);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle("Cable upright Row");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtvaicablerowchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 75-70% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.cablerightrowbanmot);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước, Lưng Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);

        m = new Model();
        m.setTitle("Dumbell Rear Lateral");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtvaidumbellrearchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaidumbellrearminh);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước, Lưng Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);
///////////////////////////////////////////////////////////////////////////////////////////////////
       /* m = new Model();
        m.setTitle("Shoulder Exercise");
        models.add(m);*/

        m = new Model();
        m.setTitle("Squad Globe");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtchansquadchuan);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chansquadtanang );
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

        m = new Model();
        m.setTitle("Leg Press");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtchanleggpress);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chanleggpress);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

        m = new Model();
        m.setTitle("Grarian Split");
        m.setDescription("Cường độ");
        m.setImg(R.drawable.avtchanbul);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 75-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chanbulgariansplitsquatbanmot);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

///////////////////////////////////////////////////////////////////////////////////////////////////
        m = new Model();
        m.setTitle("Crunch");
        m.setDescription("Cách thức hiện");
        m.setImg(R.drawable.avtbungcrusch);
        m.setDescripAdd("– Nằm thẳng trên sàn, để đầu, lưng và mông áp sát mặt đất.\n" +
                "\n" +
                "– Hai chân chống lên tạo cảm giác thoải mái, hai tay đan chéo và đặt sau đầu.\n" +
                "\n" +
                "– Nâng đầu và vai lên khỏi sàn sao cho lưng vẫn chạm đất, đồng thời hít sâu vào; sau đó hạ người về vị trí cũ và thở ra. Lặp lại bài tập này với 15 lần.");
        m.setImgAdd(R.drawable.bungcruschminh);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Bụng\n" +
                "Cơ liên quan: Cơ liên sườn,Lưng\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Gập");
        models.add(m);

        m = new Model();
        m.setTitle("Swequity");
        m.setDescription("Cách thực hiện");
        m.setImg(R.drawable.avtswequity);
        m.setDescripAdd("– Nằm ngửa trên sàn, đặt tay phải phía sau đầu và đặt tay trái lên bụng, để đầu gối tạo thành một góc 90 độ với mặt sàn.\n" +
                "\n" +
                "– Nâng đầu và vai lên khỏi mặt sàn và quay người sang phải sao cho khuỷu tay trái chạm vào đầu gối phải, giữ trong và giây.\n" +
                "\n" +
                "– Trở về vị trí ban đầu và làm tương tự vói bên kia. Lặp lại bài tập này cho mỗi bên từ 12 – 15 lần.");
        m.setImgAdd(R.drawable.bungswequity);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Bụng\n" +
                "Cơ liên quan: Cơ liên sườn, Lưng dưới\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Gập");
        models.add(m);

        m = new Model();
        m.setTitle("V-Up");
        m.setDescription("Cách thực hiện");
        m.setImg(R.drawable.avtvupchuan);
        m.setDescripAdd("– Nằm thẳng trên sàn nhà, hai chân duỗi thẳng, hai tay để thẳng qua đầu.\n" +
                "\n" +
                "– Nâng người và hai chân lên, vươn thẳng hai tay về phía đầu ngón chân, giữ tư thế này trong 1 – 3 giây.\n" +
                "\n" +
                "– Trở về vị trí ban đầu và lặp lại động tác.");
        m.setImgAdd(R.drawable.bungvup);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Bụng\n" +
                "Cơ liên quan: Cơ liên sườn\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Gập");
        models.add(m);


        m = new Model();
        m.setTitle("Plank");
        m.setDescription("Cách thực hiện");
        m.setImg(R.drawable.avtplankminh);
        m.setDescripAdd("– Nằm úp người trên sàn giống như khi thực hiện bài tập hít đất.\n" +
                "\n" +
                "– Hai khuỷu tay chống trên mặt sàn để giữ trọng lượng cơ thể.\n" +
                "\n" +
                "– Hai chân chống trên mặt sàn bằng các đầu ngón chân và mở rộng vừa phải.\n" +
                "\n" +
                "– Sau đó nâng cơ thể lên khỏi mặt sàn và giữ cơ thể bạn thành một đường thẳng từ vai đến mắt cá chân.\n" +
                "\n" +
                "– Giữ tư thế này trong 30 – 40 giây và lặp lại bài tập này 3 lần. Nếu bạn thấy đau thắt lưng thì nên hạ người xuống.");
        m.setImgAdd(R.drawable.bungplank);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Mô tả");
        m.setDescriptionMoTaKTT("Cơ chính: Bụng\n" +
                "Cơ liên quan: Cơ liên sườn\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Giữ");
        models.add(m);

        return models;
    }
}

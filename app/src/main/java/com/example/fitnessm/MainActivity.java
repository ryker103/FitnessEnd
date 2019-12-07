package com.example.fitnessm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList()
    {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Barbell bench press");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtngucduoitangang);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 85-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucngangtadon);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực giữa\n" +
                "Cơ liên quan: Vai, cơ tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle("Dumbell bench press");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avdnguctrentadon);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 85-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.nguctremau);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực trên\n" +
                "Cơ liên quan: Vai, cơ tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);



        m = new Model();
        m.setTitle("Dumbell fly");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtngucfly);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 70-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucflyy);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực trong\n" +
                "Cơ liên quan: Vai, cơ lưng, tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);


        m = new Model();
        m.setTitle("Machine fly");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtngucep);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 70-80% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.nguckeocapmau);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực\n" +
                "Cơ liên quan: Vai, cơ xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);


        m = new Model();
        m.setTitle("Machine Chest Press");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtngucmay);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.ngucdaymay);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Ngực\n" +
                "Cơ liên quan: Vai, tay sau\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        //vai
        m = new Model();
        m.setTitle("Shoulder Exercise");
        models.add(m);





        m = new Model();
        m.setTitle(" Seated Lateral raise");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtvai2ben);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 70-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaihaiben);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: vai\n" +
                "Cơ liên quan: Tay trước, Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle(" Seated Snath");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtvaitruoc);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 65-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaitruoc);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);

        m = new Model();
        m.setTitle("Smith Machine Overhead");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtvaismith);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 60-70% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 50-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaismith);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Đẩy");
        models.add(m);


        m = new Model();
        m.setTitle("Cable upright Row");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtvaicablerow);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 75-70% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.cablerightrow);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước, Lưng Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Kéo");
        models.add(m);

        m = new Model();
        m.setTitle("Dumbell Rear Lateral");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtvaidumbellrear);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.vaidumbellr);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Vai\n" +
                "Cơ liên quan: Tay trước, Lưng Xô\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

        m = new Model();
        m.setTitle("Shoulder Exercise");
        models.add(m);

        m = new Model();
        m.setTitle("Squad Globe");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtchansquad);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chansquadtanang );
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

        m = new Model();
        m.setTitle("Leg Press");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtchanleggpress);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 80-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 55-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chanleggpress);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);

        m = new Model();
        m.setTitle("Chanlul Grarian Split");
        m.setDescription("Intensity");
        m.setImg(R.drawable.avtchanbul);
        m.setDescripAdd("- 3 set với khối lượng tạ tăng dần.\n" +
                "- 3 rep, 3 set với lượng tạ 75-90% 1RM\n" +
                "- 4 rep, 4 set với lượng tạ 60-70% 1RM\n" +
                "- 90 - 120 giây nghỉ giữa set");
        m.setImgAdd(R.drawable.chanbulgariansplitsquat);
        //2 Des ky thjuat tap
        m.setDescriptionKTT("Description");
        m.setDescriptionMoTaKTT("Cơ chính: Đùi\n" +
                "Cơ liên quan: Mông, bắp chân\n" +
                "Dạng bài tập: Compound / Phức hợp\n" +
                "Cấp: Mới\n" +
                "Lực: Nâng");
        models.add(m);




        return models;
    }
}

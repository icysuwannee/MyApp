package com.suwan.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class BookMbtiActivity extends AppCompatActivity {

    ImageButton btnSidemenu, btnHome, btnReturn;

    String strNickname, strMbti;
    private View drawerView;
    private DrawerLayout drawerLayout;
    ImageView btnClose;
    TextView tvNickname, tvMbti;

    Button btnGame;

    TextView tvIntjContent, tvIntpContent, tvEntjContent, tvEntpContent, tvInfjContent;
    //        책먹는 여우     로즈메리의 아기   눈먼 자들의 도시  은하영웅전설1       영혼의 집
    TextView tvInfpContent, tvEnfjContent, tvEnfpContent, tvIstjContent, tvIsfjContent;
    //        룬의 아이들     이름없는 너에게, 시작도 끝도 없는모험, 궁에는 개꽃이 산다, 그리스 로마 신화
    TextView tvEstjContent, tvEsfjContent, tvIstpContent, tvIsfpContent, tvEstpContent;
    // 옛날옛적에 훠어이 훠이 ,4월이 되면 그녀는   셜록홈즈          종말일기z     미래의 묵시록
    TextView tvEsfpContent;
    //        아주 작은 습관의 힘
    // 인텐트용 타이틀
    TextView tvIntjTitle, tvIntpTitle, tvEntjTitle, tvEntpTitle, tvInfjTitle, tvInfpTitle;
    TextView tvEnfjTitle, tvEnfpTitle, tvIstjTitle, tvIsfjTitle, tvEstjTitle, tvEsfjTitle;
    TextView tvIstpTitle, tvIsfpTitle, tvEstpTitle, tvEsfpTitle;
    String add = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_mbti);


        tvNickname = (TextView) findViewById(R.id.tvNickname);
        tvMbti = (TextView) findViewById(R.id.tvMbti);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.setDrawerListener(drawerListener);


        drawerView = (View) findViewById(R.id.drawer);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        btnClose = (ImageView) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });

        btnSidemenu = (ImageButton) findViewById(R.id.btnSidemenu);
        btnHome = (ImageButton) findViewById(R.id.btnHome);
        btnReturn = (ImageButton) findViewById(R.id.btnReturn);

        btnSidemenu.setOnClickListener(mClickListener);
        btnHome.setOnClickListener(mClickListener);
        btnReturn.setOnClickListener(mClickListener);

        //버튼

        btnGame = (Button) findViewById(R.id.btnGame);

        btnGame.setOnClickListener(mClickListener);

        //책 사이트 이동
        tvIntjContent = (TextView) findViewById(R.id.tvIntjContent);//1
        tvIntpContent = (TextView) findViewById(R.id.tvIntpContent);//2
        tvEntjContent = (TextView) findViewById(R.id.tvEntjContent);//3
        tvEntpContent = (TextView) findViewById(R.id.tvEntpContent);//4
        tvInfjContent = (TextView) findViewById(R.id.tvInfjContent);//5
        tvInfpContent = (TextView) findViewById(R.id.tvInfpContent);//6
        tvEnfjContent = (TextView) findViewById(R.id.tvEnfjContent);//7
        tvEnfpContent = (TextView) findViewById(R.id.tvEnfpContent);//8
        tvIstjContent = (TextView) findViewById(R.id.tvIstjContent);//9
        tvIsfjContent = (TextView) findViewById(R.id.tvIsfjContent);//10
        tvEstjContent = (TextView) findViewById(R.id.tvEstjContent);//11
        tvEsfjContent = (TextView) findViewById(R.id.tvEsfjContent);//12
        tvIstpContent = (TextView) findViewById(R.id.tvIstpContent);//13
        tvIsfpContent = (TextView) findViewById(R.id.tvIsfpContent);//14
        tvEstpContent = (TextView) findViewById(R.id.tvEstpContent);//15
        tvEsfpContent = (TextView) findViewById(R.id.tvEsfpContent);//16

        //책 타이틀
        tvIntjTitle = (TextView) findViewById(R.id.tvIntjTitle);//1
        tvIntpTitle = (TextView) findViewById(R.id.tvIntpTitle);//2
        tvEntjTitle = (TextView) findViewById(R.id.tvEntjTitle);//3
        tvEntpTitle = (TextView) findViewById(R.id.tvEntpTitle);//4
        tvInfjTitle = (TextView) findViewById(R.id.tvInfjTitle);//5
        tvInfpTitle = (TextView) findViewById(R.id.tvInfpTitle);//6
        tvEnfjTitle = (TextView) findViewById(R.id.tvEnfjTitle);//7
        tvEnfpTitle = (TextView) findViewById(R.id.tvEnfpTitle);//8
        tvIstjTitle = (TextView) findViewById(R.id.tvIstjTitle);//9
        tvIsfjTitle = (TextView) findViewById(R.id.tvIsfjTitle);//10
        tvEstjTitle = (TextView) findViewById(R.id.tvEstjTitle);//11
        tvEsfjTitle = (TextView) findViewById(R.id.tvEsfjTitle);//12
        tvIstpTitle = (TextView) findViewById(R.id.tvIstpTitle);//13
        tvIsfpTitle = (TextView) findViewById(R.id.tvIsfpTitle);//14
        tvEstpTitle = (TextView) findViewById(R.id.tvEstpTitle);//15
        tvEsfpTitle = (TextView) findViewById(R.id.tvEsfpTitle);//16

        //
        tvIntjContent.setOnClickListener(mClickListener);//1
        tvIntpContent.setOnClickListener(mClickListener);//2
        tvEntjContent.setOnClickListener(mClickListener);//3
        tvEntpContent.setOnClickListener(mClickListener);//4
        tvInfjContent.setOnClickListener(mClickListener);//5
        tvInfpContent.setOnClickListener(mClickListener);//6
        tvEnfjContent.setOnClickListener(mClickListener);//7
        tvEnfpContent.setOnClickListener(mClickListener);//8
        tvIstjContent.setOnClickListener(mClickListener);//9
        tvIsfjContent.setOnClickListener(mClickListener);//10
        tvEstjContent.setOnClickListener(mClickListener);//11
        tvEsfjContent.setOnClickListener(mClickListener);//12
        tvIstpContent.setOnClickListener(mClickListener);//13
        tvIsfpContent.setOnClickListener(mClickListener);//14
        tvEstpContent.setOnClickListener(mClickListener);//15
        tvEsfpContent.setOnClickListener(mClickListener);//16


    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {

        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.btnSidemenu:
                    drawerLayout.openDrawer(drawerView);
                    break;
                case R.id.btnHome:
                    Intent intentBack = new Intent(BookMbtiActivity.this, MainActivity.class);
                    startActivity(intentBack);
                    finish();
                    break;
//                case R.id.btnReturn:
//                    Intent intentBack1 = new Intent(GameMbtiActivity.this, MainActivity.class);
//                    startActivity(intentBack1);
//                    finish();
//                    break;
                case R.id.btnGame:
                    Intent game = new Intent(BookMbtiActivity.this, GameMbtiActivity.class);
                    startActivity(game);
                    finish();
                    break;


                // 책 사이트 이동
                case R.id.tvIntjContent://1
                    add = tvIntjTitle.getText().toString();
                    Intent fff1 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff1.putExtra("add", add);
                    startActivity(fff1);
                    break;
                case R.id.tvIntpContent://2
                    add = tvIntpTitle.getText().toString();
                    Intent fff2 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff2.putExtra("add", add);
                    startActivity(fff2);
                    break;
                case R.id.tvEntjContent://3
                    add = tvEntjTitle.getText().toString();
                    Intent fff3 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff3.putExtra("add", add);
                    startActivity(fff3);
                    break;
                case R.id.tvEntpContent://4
                    add = tvEntpTitle.getText().toString();
                    Intent fff4 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff4.putExtra("add", add);
                    startActivity(fff4);
                    break;
                case R.id.tvInfjContent://5
                    add = tvInfjTitle.getText().toString();
                    Intent fff5 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff5.putExtra("add", add);
                    startActivity(fff5);
                    break;
                case R.id.tvInfpContent://6
                    add = tvInfpTitle.getText().toString();
                    Intent fff6 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff6.putExtra("add", add);
                    startActivity(fff6);
                    break;
                case R.id.tvEnfjContent://7
                    add = tvEnfjTitle.getText().toString();
                    Intent fff7 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff7.putExtra("add", add);
                    startActivity(fff7);
                    break;
                case R.id.tvEnfpContent://8
                    add = tvEnfpTitle.getText().toString();
                    Intent fff8 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff8.putExtra("add", add);
                    startActivity(fff8);
                    break;
                case R.id.tvIstjContent://9
                    add = tvIstjTitle.getText().toString();
                    Intent fff9 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff9.putExtra("add", add);
                    startActivity(fff9);
                    break;
                case R.id.tvIsfjContent://10
                    add = tvIsfjTitle.getText().toString();
                    Intent fff10 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff10.putExtra("add", add);
                    startActivity(fff10);
                    break;
                case R.id.tvEstjContent://11
                    add = tvEstjTitle.getText().toString();
                    Intent fff11 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff11.putExtra("add", add);
                    startActivity(fff11);
                    break;
                case R.id.tvEsfjContent://12
                    add = tvEsfjTitle.getText().toString();
                    Intent fff12 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff12.putExtra("add", add);
                    startActivity(fff12);
                    break;
                case R.id.tvIstpContent://13
                    add = tvIstpTitle.getText().toString();
                    Intent fff13 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff13.putExtra("add", add);
                    startActivity(fff13);
                    break;
                case R.id.tvIsfpContent://14
                    add = tvIsfpTitle.getText().toString();
                    Intent fff14 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff14.putExtra("add", add);
                    startActivity(fff14);
                    break;
                case R.id.tvEstpContent://15
                    add = tvEstpTitle.getText().toString();
                    Intent fff15 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff15.putExtra("add", add);
                    startActivity(fff15);
                    break;
                case R.id.tvEsfpContent://16
                    add = tvEsfpTitle.getText().toString();
                    Intent fff16 = new Intent(BookMbtiActivity.this, Web_View.class);
                    fff16.putExtra("add", add);
                    startActivity(fff16);
                    break;
            }
        }
    };

    // 뒤로가기 버튼 설정
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intentBack = new Intent(BookMbtiActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }

    DrawerLayout.DrawerListener drawerListener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
            if (strNickname == null) {
                tvNickname.setText("닉네임");
            } else {
                tvNickname.setText(strNickname);
            }
            if (strMbti == null) {
                tvMbti.setText("ENFP");
            } else {
                tvMbti.setText(strMbti);
            }
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };


}
package com.example.rough;


        import android.graphics.PointF;

        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.ImageView;

        import androidx.appcompat.app.AppCompatActivity;

public class Main8Activity extends AppCompatActivity {
    ImageView image;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    PointF DownPT = new PointF(); // Record Mouse Position When Pressed Down
    PointF StartPT = new PointF(); // Record Start Position of 'image'

    PointF DownPTT = new PointF(); // Record Mouse Position When Pressed Down
    PointF StartPTT = new PointF(); // Record Start Position of 'image1'

    PointF DownPT2 = new PointF();
    PointF StartPT2 = new PointF();
    PointF DownPT3 = new PointF();
    PointF StartPT3 = new PointF();

    PointF DownPT4 = new PointF();
    PointF StartPT4 = new PointF();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        image=(ImageView) findViewById(R.id.imageView2);
        image1=(ImageView) findViewById(R.id.imageView3);
        image2=(ImageView) findViewById(R.id.imageView4);
        image3=(ImageView) findViewById(R.id.imageView5);
        image4=(ImageView) findViewById(R.id.imageView6);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            int resId=bundle.getInt("resId");
            image.setImageResource(resId);
            int resId1=bundle.getInt("resId1");
            image1.setImageResource(resId1);
            int resId11=bundle.getInt("resId11");
            image2.setImageResource(resId11);
            int resId111=bundle.getInt("resId111");
            image3.setImageResource(resId111);
            int resId1111=bundle.getInt("resId1111");
            image4.setImageResource(resId1111);




        }

        image.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE :
                        PointF mv = new PointF( event.getX() - DownPT.x, event.getY() - DownPT.y);
                        image.setX((int)(StartPT.x+mv.x));
                        image.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF( image.getX(), image.getY() );
                        break;
                    case MotionEvent.ACTION_DOWN :
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF( image.getX(), image.getY() );
                        break;
                    case MotionEvent.ACTION_UP :
                        // Nothing have to do
                        break;
                    default :
                        break;
                }
                return true;
            }
        });





        image1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE :
                        PointF mv = new PointF( event.getX() - DownPTT.x, event.getY() - DownPTT.y);
                        image1.setX((int)(StartPTT.x+mv.x));
                        image1.setY((int)(StartPTT.y+mv.y));
                        StartPTT = new PointF( image1.getX(), image1.getY() );
                        break;
                    case MotionEvent.ACTION_DOWN :
                        DownPTT.x = event.getX();
                        DownPTT.y = event.getY();
                        StartPTT = new PointF( image1.getX(), image1.getY() );
                        break;
                    case MotionEvent.ACTION_UP :
                        // Nothing have to do
                        break;
                    default :
                        break;
                }
                return true;
            }
        });



        image2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE :
                        PointF mv = new PointF( event.getX() - DownPT2.x, event.getY() - DownPT2.y);
                        image2.setX((int)(StartPT2.x+mv.x));
                        image2.setY((int)(StartPT2.y+mv.y));
                        StartPT2 = new PointF( image2.getX(), image2.getY() );
                        break;
                    case MotionEvent.ACTION_DOWN :
                        DownPT2.x = event.getX();
                        DownPT2.y = event.getY();
                        StartPT2 = new PointF( image2.getX(), image2.getY() );
                        break;
                    case MotionEvent.ACTION_UP :
                        // Nothing have to do
                        break;
                    default :
                        break;
                }
                return true;
            }
        });

        image3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE :
                        PointF mv = new PointF( event.getX() - DownPT3.x, event.getY() - DownPT.y);
                        image3.setX((int)(StartPT3.x+mv.x));
                        image3.setY((int)(StartPT3.y+mv.y));
                        StartPT3 = new PointF( image3.getX(), image3.getY() );
                        break;
                    case MotionEvent.ACTION_DOWN :
                        DownPT3.x = event.getX();
                        DownPT3.y = event.getY();
                        StartPT3 = new PointF( image3.getX(), image3.getY() );
                        break;
                    case MotionEvent.ACTION_UP :
                        // Nothing have to do
                        break;
                    default :
                        break;
                }
                return true;
            }
        });

        image4.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE :
                        PointF mv = new PointF( event.getX() - DownPT4.x, event.getY() - DownPT.y);
                        image4.setX((int)(StartPT4.x+mv.x));
                        image4.setY((int)(StartPT4.y+mv.y));
                        StartPT4 = new PointF( image4.getX(), image4.getY() );
                        break;
                    case MotionEvent.ACTION_DOWN :
                        DownPT4.x = event.getX();
                        DownPT4.y = event.getY();
                        StartPT4 = new PointF( image4.getX(), image4.getY() );
                        break;
                    case MotionEvent.ACTION_UP :
                        // Nothing have to do
                        break;
                    default :
                        break;
                }
                return true;
            }
        });


    }
}



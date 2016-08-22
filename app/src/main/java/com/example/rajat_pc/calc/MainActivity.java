package com.example.rajat_pc.calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {


    private EditText edt;
    /*private Button clear;
    private Button lbracket;
    private Button rbracket;
    private Button backspace;
    private Button one;
    private Button twoo;
    private Button thre;
    private Button divide;
    private Button mul;
    private Button add;
    private Button sub;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;
    private Button sqrt;
    private Button equal;
    private Button power;
    private Button recip;
    private Button curt;*/

    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        edt = (EditText) findViewById(R.id.text);
        /*clear = (Button) findViewById(R.id.clear);
        lbracket = (Button) findViewById(R.id.lbracket);
        rbracket = (Button) findViewById(R.id.rbracket);
        backspace = (Button) findViewById(R.id.backspace);
        one = (Button) findViewById(R.id.one);
        twoo = (Button) findViewById(R.id.two);
        thre = (Button) findViewById(R.id.three);
        divide = (Button) findViewById(R.id.divide);
        mul = (Button) findViewById(R.id.mul);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        decimal = (Button) findViewById(R.id.decimal);
        sqrt = (Button) findViewById(R.id.sqrt);
        equal = (Button) findViewById(R.id.equal);
        power = (Button) findViewById(R.id.power);
        recip = (Button) findViewById(R.id.recip);
        curt = (Button) findViewById(R.id.curt);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }


    public void onClick1(View v) {
        a = edt.getText().toString();
        if(a.matches(""))
            a = "1";
        else
            a = a+"1";
        edt.setText(a);
    }

    public void onClick2(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "2";
        else
            a = a+"2";
        edt.setText(a);
    }

    public void onClick3(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "3";
        else
            a = a+"3";
        edt.setText(a);
    }

    public void onClick4(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "4";
        else
            a = a+"4";
        edt.setText(a);
    }

    public void onClick5(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "5";
        else
            a = a+"5";
        edt.setText(a);
    }

    public void onClick6(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "6";
        else
            a = a+"6";
        edt.setText(a);
    }

    public void onClick7(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "7";
        else
            a = a+"7";
        edt.setText(a);
    }

    public void onClick8(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "8";
        else
            a = a+"8";
        edt.setText(a);
    }

    public void onClick9(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "9";
        else
            a = a+"9";
        edt.setText(a);
    }

    public void onClick0(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "0";
        else
            a = a+"0";
        edt.setText(a);
    }

    public void onClickcl(View v){
        a = edt.getText().toString();
        if(!a.matches(""))
            a = "";
        edt.setText(a);
    }

    public void onClicklb(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "(";
        else
            a = a+"(";
        edt.setText(a);
    }

    public void onClickrb(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = ")";
        else
            a = a+")";
        edt.setText(a);
    }
    public void onClickbs(View v){
        a = edt.getText().toString();
        if(!a.matches(""))
        {
            a = a.substring(0,a.length()-1);
        }
        edt.setText(a);
    }

    public void onClickdiv(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "/";
        else
            a = a+"/";
        edt.setText(a);
    }

    public void onClickmul(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "*";
        else
            a = a+"*";
        edt.setText(a);
    }

    public void onClickadd(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "+";
        else
            a = a+"+";
        edt.setText(a);
    }

    public void onClicksub(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "-";
        else
            a = a+"-";
        edt.setText(a);
    }

    public void onClickdec(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = ".";
        else
            a = a+".";
        edt.setText(a);
    }

    public void onClickpower(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "^";
        else
            a = a+"^";
        edt.setText(a);
    }

    public void onClicksq(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "s";
        else
            a = a+"s";
        edt.setText(a);
    }

    public void onClickcb(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            a = "q";
        else
            a = a+"q";
        edt.setText(a);
    }


    public void onClickrec(View v){
        a = edt.getText().toString();
        if(a.matches(""))
            edt.setText("Invalid Expression");
        else{
            a = "1/("+a+")";
            edt.setText(a);
        }

    }

    static Boolean w;

    public static int precedence(String c)
    {
        Character ch = c.charAt(0);
        if(ch.equals('s')||ch.equals('q')||ch.equals('^'))
        {
            return 4;
        }
        else if(ch.equals('/')||ch.equals('*'))
        {
            return 3;
        }
        else if(ch.equals('+')||ch.equals('-'))
            return 2;
        else
            return 0;
    }

    public static String calculate(String a,String b,String op)
    {
        Double a1 = Double.parseDouble(a);
        Double b1 = Double.parseDouble(b);
        //System.out.println(a1+" + "+b1);
        if(op.equals("^"))
        {
            double ans =  Math.pow(b1,a1);
            return Double.toString(ans);
        }
        else if(op.equals("/"))
        {
            double ans = b1/a1;
            return Double.toString(ans);
        }
        else if(op.equals("*"))
        {
            double ans = b1*a1;
            return Double.toString(ans);
        }
        else if(op.equals("+"))
        {
            double ans = b1+a1;
            //System.out.println("ans = "+ans);
            return Double.toString(ans);
        }
        else
        {
            double ans = b1-a1;
            return Double.toString(ans);
        }
    }

    public static String calculate(String a,String op)
    {
        Double a1 = Double.parseDouble(a);
        if(op.equals("s"))
        {
            double ans =  Math.pow(a1,0.5);
            return Double.toString(ans);
        }
        else
        {
            double ans =  Math.cbrt(a1);
            return Double.toString(ans);
        }
    }


    public static String evaluate(Vector<String> vec,Boolean w)
    {
        //int ln = vec.capacity();
        Vector<String> v = new Vector();
        String s;
        Stack<String> stk = new Stack();
        Enumeration vEnum = vec.elements();

        while(vEnum.hasMoreElements())
        {
            s = (String) vEnum.nextElement();
            //System.out.println(s);
            if(s.length()>1||(s.length() == 1&&Character.isDigit(s.charAt(0))))
            {
                v.addElement(s);
            }
            else
            {
                Character c;
                if(s.length()>=1)
                c = s.charAt(0);
                else
                break;
                if(c == '(')
                {
                    stk.push(c.toString());
                }
                else if(c == ')')
                {
                    while(!stk.empty()) {
                            if (!(stk.peek()).equals("(")) {
                                String ch = (String) stk.pop();
                                v.addElement(ch);
                            }
                            else
                                break;
                    }
                    if(stk.empty())
                    {
                        w = true;
                        return "";
                    }
                    else
                    {
                        stk.pop();
                    }
                }
                else
                {
                    if(stk.empty())
                    {
                        stk.push(c.toString());
                    }
                    else
                    {
                        while(!stk.empty()) {
                            if (precedence(stk.peek()) > precedence(c.toString())) {
                                v.addElement(stk.pop());
                            }
                            else
                                break;
                        }
                        stk.push(c.toString());
                    }
                }
            }
        }
        while(!stk.empty()) {
            if (stk.peek() != "(") {
                v.addElement(stk.pop());
            }
            else
                break;
        }
        stk.clear();

        //ln = v.capacity();
        vEnum = v.elements();
        while(vEnum.hasMoreElements())
        {
            s = (String) vEnum.nextElement();
            //System.out.println(s);
            if(s.length()>1||(s.length() == 1&&Character.isDigit(s.charAt(0))))
            {
                stk.push(s);
            }
            else if(s.equals("s")||s.equals("q"))
            {
                String s1;
                if(!stk.empty())
                {
                    s1 = stk.pop();
                    s1 = calculate(s1,s);
                    stk.push(s1);
                }
                else
                {
                    w = true;
                    return "";
                }
            }
            else
            {
                String s1 = new String(),s2;
                if(!stk.empty())
                {
                    try {
                        s1 = stk.pop();
                    }catch(EmptyStackException e){

                    }
                }
                else
                {
                    w = true;
                    return "";
                }
                if(!stk.empty())
                {
                    s2 = stk.pop();
                }
                else
                {
                    w = true;
                    return "";
                }
                s1 = calculate( s1,s2,s);
                stk.push(s1);
            }
        }
        if(!stk.empty())
            return stk.peek();
        else
        {
            w = true;
            return "";
        }
    }

    public void onClickeq(View v){
        a = edt.getText().toString();
        Vector<String> vec = new Vector();
        //String a = new String();
        //Scanner scan = new Scanner(System.in);
        //a = scan.next();
        int ln = a.length();
        String s = new String();
        Character c;
        for(int i = 0;i<ln;i++)
        {
            c = a.charAt(i);
            if(Character.isDigit(c)||c.equals('.'))
            {

                if(s.isEmpty())
                    s = c.toString();
                else
                    s += c.toString();
            }
            else
            {
                if(!s.isEmpty())
                vec.addElement(s);
                s = "";
                vec.addElement(c.toString());
            }
        }
        vec.addElement(s);
        w = false;
        /*for(int i = 0;i<vec.capacity();i++)
        {
            System.out.println(vec.elementAt(i));
        }*/
        String ans = evaluate(vec,w);
        if(w == true)
        {
            ans = "Invalid Expression";
            //System.out.println("NO WAY");
        }
        //System.out.println("\nExpression value = "+ans);
        edt.setText(ans);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

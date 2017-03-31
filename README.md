# CssTextView
这是基于TextView的扩展小控件，一个支持设置一段文字设置不同的颜色、大小、字体样式以及点击事件

## 效果图
![sport](http://o9o9d242i.bkt.clouddn.com/csstextview.gif)

## 使用方法
1. **添加gradle依赖**
	
		compile 'com.sflin:csstextview:1.0.0'
		
2. **效果实现代码**

		//1.设置一段文字内容（必须要先设置一段文字）
        mCSSTextView.setText("这是一个基于TextView扩展控件,实现了可对一段文字内容，设置不同的字体大小,字体样式,字体样式以及设置点击事件");
        //2.设置文字整体的字体大小
        mCSSTextView.setTextSize(14);
        //3.设置文字整体的字体颜色
        mCSSTextView.setTextColor(Color.BLACK);
        //4.开始设置指定字体的颜色，大小，样式，点击事件
        mCSSTextView.setTextArrColor("这是",Color.GREEN);
        mCSSTextView.setTextArrSize("一个",12);
        //Typeface.NORMAL、Typeface.BOLD、Typeface.ITALIC、Typeface.BOLD_ITALIC(四种样式)
        mCSSTextView.setTextArrStyle("基于", Typeface.BOLD);
        //设置点击事件
        mCSSTextView.setTextClick("TextView", new CSSTextView.OnClickSpan() {
                    @Override
                    public void onClick(String text) {
                        Toast.makeText(MainActivity.this,"我是"+text,Toast.LENGTH_SHORT).show();
                    }
                });
        mCSSTextView.setTextArrColorSizeStyle("实现了可对一段文字内容",Color.BLUE,16,Typeface.ITALIC);

        //对一段文字中的相同内容设置不同颜色，可以用开始位置来区分
        mCSSTextView.setTextArrColor("字体",Color.RED,36);
        mCSSTextView.setTextArrColor("字体",Color.YELLOW,41);
        mCSSTextView.setTextArrColor("字体",Color.BLUE,46);

        mCSSTextView.setTextArrColorSizeStyle("设置点击事件", Color.GREEN, 18, Typeface.BOLD_ITALIC,
                new CSSTextView.OnClickSpan() {
                    @Override
                    public void onClick(String text) {
                        Toast.makeText(MainActivity.this,"我是"+text,Toast.LENGTH_SHORT).show();
                    }
                });

        mCSSTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"我是整段文字",Toast.LENGTH_SHORT).show();
            }
        });
        
## 方法说明


1. 设置文本内容其中文字的颜色 text文字 color颜色 startIndex开始位置 OnClickSpan点击事件
		
		setTextArrColor(String text, int color) 

		setTextArrColor(String text, int color, OnClickSpan onClickSpan)

		setTextArrColor(String text, int color, int startIndex)

		setTextArrColor(String text, int color, int startIndex, OnClickSpan onClickSpan)

2. 设置文本内容其中文字的字体大小 text文字 size大小 startIndex开始位置 OnClickSpan点击事件

		setTextArrSize(String text, int size)

		setTextArrSize(String text, int size, OnClickSpan onClickSpan)

		setTextArrSize(String text, int size, int startIndex)

		setTextArrSize(String text, int size, int startIndex, OnClickSpan onClickSpan)

3. 设置文本内容其中文字的字体样式 text文字 style样式 startIndex开始位置 OnClickSpan点击事件  
(样式:Typeface.NORMAL、Typeface.BOLD、Typeface.ITALIC、Typeface.BOLD_ITALIC）

		setTextArrStyle(String text, int style)

		setTextArrStyle(String text, int style, OnClickSpan onClickSpan)

		setTextArrStyle(String text, int style, int startIndex)

		setTextArrStyle(String text, int style, int startIndex, OnClickSpan onClickSpan)

4. 设置文本内容其中文字的点击事件 text文字 startIndex开始位置 OnClickSpan点击事件

		setTextClick(String text, OnClickSpan onClickSpan)

		setTextClick(String text, int startIndex, OnClickSpan onClickSpan)

5. 设置文本内容其中文字的字体颜色，字体大小 text文字 color颜色 size大小 startIndex开始位置 OnClickSpan点击事件

		setTextArrColorSize(String text, int color, int size)

		setTextArrColorSize(String text, int color, int size, OnClickSpan onClickSpan)

		setTextArrColorSize(String text, int color, int size, int startIndex)

		setTextArrColorSize(String text, int color, int size, int startIndex, OnClickSpan onClickSpan)

5. 设置文本内容其中文字的字体颜色，字体样式 text文字 color颜色 style样式 startIndex开始位置 OnClickSpan点击事件

		setTextArrColorStyle(String text, int color, int style)

		setTextArrColorStyle(String text, int color, int style, OnClickSpan onClickSpan)

		setTextArrColorStyle(String text, int color, int style, int startIndex)

		setTextArrColorStyle(String text, int color, int style, int startIndex, OnClickSpan onClickSpan)

6. 设置文本内容其中文字的字体大小，字体样式 text文字 size大小 style样式 startIndex开始位置 OnClickSpan点击事件

		setTextArrSizeStyle(String text, int size, int style)

		setTextArrSizeStyle(String text, int size, int style, OnClickSpan onClickSpan)

		setTextArrSizeStyle(String text, int size, int style, int startIndex)

		setTextArrSizeStyle(String text, int size, int style, int startIndex, OnClickSpan onClickSpan)

7. 设置文本内容其中文字的字体颜色，字体大小，字体样式 text文字 color颜色 size大小 style样式 startIndex开始位置 OnClickSpan点击事件

		setTextArrColorSizeStyle(String text, int color, int size, int style)

		setTextArrColorSizeStyle(String text, int color, int size, int style, OnClickSpan onClickSpan)

		setTextArrColorSizeStyle(String text, int color, int size, int style, int startIndex)

		setTextArrColorSizeStyle(String text, int color, int size, int style, int startIndex, OnClickSpan onClickSpan)
		


#### 	其他
如果你觉得还不错，欢迎Star. 欢迎加入交流群: 114925972
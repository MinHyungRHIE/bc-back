# GIT 문서 만들기 위한 Markdown사용법

<hr><hr><hr>

# H1 "# 입력"
## H1 "## 입력"
### H1 "### 입력"
#### H1 "#### 입력"
##### H1 "##### 입력"
###### H1 "###### 입력"

<hr>

* 1단계 "*" or "+" or "-" --> 혼합 사용 가능
  * 2단계
    * 3단계
      * 4단계
      
<hr>

``` This is a normal paragraph: this is a code block. end code block. ```

<pre>
주의!!! ``` 를 쓸때 한줄 띄어쓰면 인식이 제대로 안됨
</pre>

<hr>

[Naver][1]

[1]:https://www.naver.com "네이버 웹사이트"
<pre>
[link keyword][id]

[id]:URL "Optional Title"
</pre>

구글로 이동하기 : [GOOGLE](https://www.google.com "구글로 이동합니다")

<pre>
syntax: [Title](link "링크설명")
</pre>

<https://www.daum.net>

```<https://www.daum.net>```

<hr>

*기울이기* <br>
_기울이기_ <br>
**진하게** <br>
__진하게__ <br>
++밑줄++ <br>
~~수정~~

<pre>
*기울이기*
_기울이기_
**진하게**
__진하게__
++밑줄++
~~수정~~
</pre>

<hr>

![대체 텍스트(alternative text)를 입력하세요!](http://www.gstatic.com/webp/gallery/5.jpg "링크 설명(title)을 작성하세요.")

![Kayak][logo]

[logo]: http://www.gstatic.com/webp/gallery/2.jpg "To go kayaking."

[![Vue](https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Vue.js_Logo_2.svg/330px-Vue.js_Logo_2.svg.png)](https://kr.vuejs.org/)
<pre>
![대체 텍스트(alternative text)를 입력하세요!](http://www.gstatic.com/webp/gallery/5.jpg "링크 설명(title)을 작성하세요.")

![Kayak][logo]

[logo]: http://www.gstatic.com/webp/gallery/2.jpg "To go kayaking."

[![Vue](https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Vue.js_Logo_2.svg/330px-Vue.js_Logo_2.svg.png)](https://kr.vuejs.org/)
</pre>

<hr>

<pre>```html 여기에 HTML코드 적기 ```</pre>

```html
<a href="https://www.google.co.kr/" target="_blank">GOOGLE</a>
```

<pre>```java 여기에 JAVA코드 적기```</pre>

```java
public String method(String str){
 return str + "입니다";
}
```

<hr>

| 값 | 의미 | 기본값 |
|---|:---:|---:|
| `static` | 유형(기준) 없음 / 배치 불가능 | `static` |
| `relative` | 요소 자신을 기준으로 배치 |  |
| `absolute` | 위치 상 부모(조상)요소를 기준으로 배치 |  |
| `fixed` | 브라우저 창을 기준으로 배치 |  |

<pre>
| 값 | 의미 | 기본값 |
|---|:---:|---:|
| `static` | 유형(기준) 없음 / 배치 불가능 | `static` |
| `relative` | 요소 자신을 기준으로 배치 |  |
| `absolute` | 위치 상 부모(조상)요소를 기준으로 배치 |  |
| `fixed` | 브라우저 창을 기준으로 배치 |  |
</pre>

<hr>

인용문(blockQuote)

> 남의 말이나 글에서 직접 또는 간접으로 따온 문장. <br>
> _(네이버 국어 사전)_ 

BREAK!

> 인용문을 작성하세요! 
>> 중첩된 인용문(nested blockquote)을 만들 수 있습니다. 
>>> 중중첩된 인용문 1 <br>
>>> 중중첩된 인용문 2 <br>
>>> 중중첩된 인용문 3 <br>

<pre>
인용문(blockQuote)

> 남의 말이나 글에서 직접 또는 간접으로 따온 문장. br태그
> _(네이버 국어 사전)_ 

BREAK!

> 인용문을 작성하세요! 
>> 중첩된 인용문(nested blockquote)을 만들 수 있습니다. 
>>> 중중첩된 인용문 1 br태그
>>> 중중첩된 인용문 2 br태그
>>> 중중첩된 인용문 3 br태그
</pre>

<hr>

<u>마크다운에서 지원하지 않는 기능</u>을 사용할 때 유용하며 대부분 잘 동작합니다.

<img width="150" src="http://www.gstatic.com/webp/gallery/4.jpg" alt="Prunus" title="A Wild Cherry (Prunus avium) in flower">

![Prunus](http://www.gstatic.com/webp/gallery/4.jpg)

<pre>

<u>마크다운에서 지원하지 않는 기능</u>을 사용할 때 유용하며 대부분 잘 동작합니다.

img태그 width="150" src="http://www.gstatic.com/webp/gallery/4.jpg" alt="Prunus" title="A Wild Cherry (Prunus avium) in flower"

![Prunus](http://www.gstatic.com/webp/gallery/4.jpg)

</pre>

<hr>

1. Frontend
    1. HTML
    2. CSS
    3. JavaScript
        1. Vue.js
2. Backend

<pre>
1. Frontend
    1. HTML
    2. CSS
    3. JavaScript
        1. Vue.js
2. Backend
</pre>

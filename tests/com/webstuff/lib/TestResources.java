package com.webstuff.lib;

/**
 * Created by Jericho on 5/17/15.
 */
public class TestResources {

    @SuppressWarnings("unused")
    public static final String TARGET_URL = "https://www.google.com";

    @SuppressWarnings("unused")
    public static final String CANNED_GOOGLE_RESPONSE = "<!doctype html><html itemscope=\"\" " +
            "itemtype=\"http://schema.org/WebPage\" lang=\"en\">" +
            "<head><meta content=\"Search the world's information, including webpages, images, videos and more. " +
            "Google has many special features to help you find exactly what you're looking for.\" name=\"description\">" +
            "<meta content=\"noodp\" name=\"robots\"><meta content=\"/images/google_favicon_128.png\" " +
            "itemprop=\"image\"><title>Google</title>" +
            "<script>(function(){window.google={kEI:'_-5YVYj1J4a9sAX2y4DIBg',kEXPI:'18168,3700286,3700366,4017578," +
            "4024036,4026111,4029403,4029815,4030092,4031182,4031637,4032500,4032522,4032643,4032645,4032677,4033143," +
            "4033191,4033243,4033256,4033344,4033372,4034322,4034425,4035816,4035980,4036305,4036436,4036486,4036532," +
            "4036800,8500394,8501248,8501280,8501294,8501350,8501406,8501489,10200083,10200980,10201180'," +
            "authuser:0,kSID:'c9c918f0_10'};google.kHL='en';})();(function(){google.lc=[];google.li=0;" +
            "google.getEI=function(a){for(var clientBuilder;a&&(!a.getAttribute||!(clientBuilder=a.getAttribute(\"eid\")));)a=a.parentNode;" +
            "return clientBuilder||google.kEI};google.getLEI=function(a){for(var clientBuilder=null;a&&(!a.getAttribute||!(clientBuilder=a.getAttribute(\"leid\")));)a=a.parentNode;" +
            "return clientBuilder};google.https=function(){return\"https:\"==window.location.protocol};google.ml=function(){};" +
            "google.time=function(){return(new Date).getTime()};google.log=function(a,clientBuilder,e,f,l){var d=new Image,h=google.lc,g=google.li,c=\"\",m=google.ls||\"\";" +
            "d.onerror=d.onload=d.onabort=function(){delete h[g]};h[g]=d;" +
            "if(!e&&-1==clientBuilder.search(\"&ei=\")){var k=google.getEI(f),c=\"&ei=\"+k;-1==clientBuilder.search(\"&lei=\")&&" +
            "((f=google.getLEI(f))?c+=\"&lei=\"+f:k!=google.kEI&&(c+=\"&lei=\"+google.kEI))}a=e||\"/\"+(l||\"gen_204\")+\"?atyp=i&ct=\"+a+\"&cad=\"+clientBuilder+c+m+\"&zx=\"+google.time();" +
            "/^http:/i.test(a)&&google.https()?(google.ml(Error(\"a\"),!1,{src:a,glmm:1}),delete h[g]):(window.google&&window.google.vel&&\n" +
            "window.google.vel.lu&&window.google.vel.lu(a),d.src=a,google.li=g+1)};google.y={};google.x=function(a,clientBuilder){google.y[a.id]=[a,clientBuilder];return!1};" +
            "google.load=function(a,clientBuilder,e){google.x({id:a+n++},function(){google.load(a,clientBuilder,e)})};var n=0;})();" +
            "google.kCSI={};var _gjwl=location;function _gjuc(){var a=_gjwl.href.indexOf(\"#\");" +
            "if(0<=a&&(a=_gjwl.href.substring(a),0<a.indexOf(\"&q=\")||0<=a.indexOf(\"#q=\"))&&(a=a.substring(1),-1==a.indexOf(\"#\"))){for(var d=0;d<a.length;){var clientBuilder=d;\"&\"==a.charAt(clientBuilder)&&++clientBuilder;" +
            "var c=a.indexOf(\"&\",clientBuilder);-1==c&&(c=a.length);clientBuilder=a.substring(clientBuilder,c);if(0==clientBuilder.indexOf(\"fp=\"))a=a.substring(0,d)+a.substring(c,a.length),c=d;" +
            "else if(\"cad=h\"==clientBuilder)return 0;d=c}_gjwl.href=\"/search?\"+a+\"&cad=h\";return 1}return 0}\n" +
            "function _gjh(){!_gjuc()&&window.google&&google.x&&google.x({id:\"GJH\"},function(){google.nav&&google.nav.gjh&&google.nav.gjh()})};" +
            "window._gjh&&_gjh();</script><style>#gbar,#guser{font-size:13px;padding-top:1px !important;}#gbar{height:22px}#guser{padding-bottom:7px !important;" +
            "text-align:right}.gbh,.gbd{border-top:1px solid #c9d7f1;font-size:1px}.gbh{height:0;position:absolute;top:24px;width:100%}@media all{.gb1{height:22px;margin-right:.5em;" +
            "vertical-align:top}#gbar{float:left}}a.gb1,a.gb4{text-decoration:underline !important}a.gb1,a.gb4{color:#00c !important}.gbi .gb4{color:#dd8e27 !important}.gbf .gb4{color:#900 !important}</style>" +
            "<style>body,td,a,p,.h{font-family:arial,sans-serif}body{margin:0;overflow-y:scroll}#gog{padding:3px 8px 0}td{line-height:.8em}.gac_m " +
            "td{line-height:17px}form{margin-bottom:20px}.h{color:#36c}.q{color:#00c}.ts td{padding:0}.ts{border-collapse:collapse}em{font-weight:bold;" +
            "font-style:normal}.lst{height:25px;width:496px}.gsfi,.lst{font:18px arial,sans-serif}.gsfs{font:17px arial,sans-serif}.ds{display:inline-box;" +
            "display:inline-block;margin:3px 0 4px;margin-left:4px}input{font-family:inherit}a.gb1,a.gb2,a.gb3,a.gb4{color:#11c " +
            "!important}body{background:#fff;color:black}a{color:#11c;text-decoration:none}a:hover," +
            "a:active{text-decoration:underline}.fl a{color:#36c}a:visited{color:#551a8b}a.gb1,a.gb4{text-decoration:underline}a.gb3:hover{text-decoration:none}#ghead " +
            "a.gb2:hover{color:#fff !important}.sblc{padding-top:5px}.sblc a{display:block;margin:2px 0;margin-left:13px;font-size:11px}.lsbb{background:#eee;border:solid " +
            "1px;border-color:#ccc #999 #999 #ccc;height:30px}.lsbb{display:block}.ftl,#fll a{display:inline-block;margin:0 12px}.lsb{background:url(/images/srpr/nav_logo80.png) " +
            "0 -258px repeat-x;border:none;color:#000;cursor:pointer;height:30px;margin:0;outline:0;font:15px arial,sans-serif;vertical-align:top}.lsb:active{background:#ccc}.lst:focus{outline:none}</style>" +
            "<script></script></head><body bgcolor=\"#fff\"><script>(function(){var src='/images/nav_logo199.png';var iesg=false;" +
            "document.body.onload = function(){window.n && window.n();if (document.images){new Image().src=src;}\n" +
            "if (!iesg){document.f&&document.f.q.focus();document.gbqf&&document.gbqf.q.focus();}\n" +
            "}\n" +
            "})();</script><div id=\"mngb\">    <div id=gbar><nobr><clientBuilder class=gb1>Search</clientBuilder> <a class=gb1 " +
            "href=\"https://www.google.com/imghp?hl=en&tab=wi\">Images</a> <a class=gb1 " +
            "href=\"https://maps.google.com/maps?hl=en&tab=wl\">Maps</a> <a class=gb1 " +
            "href=\"https://play.google.com/?hl=en&tab=w8\">Play</a> <a class=gb1 " +
            "href=\"https://www.youtube.com/?tab=w1\">YouTube</a> <a class=gb1 " +
            "href=\"https://news.google.com/nwshp?hl=en&tab=wn\">News</a> " +
            "<a class=gb1 href=\"https://mail.google.com/mail/?tab=wm\">Gmail</a> <a class=gb1 " +
            "href=\"https://drive.google.com/?tab=wo\">Drive</a> " +
            "<a class=gb1 style=\"text-decoration:none\" href=\"http://www.google.com/intl/en/options/\"><u>More</u> &raquo;</a>" +
            "</nobr></div><div id=guser width=100%><nobr><span id=gbn class=gbi></span><span id=gbf class=gbf></span>" +
            "<span id=gbe></span><a href=\"http://www.google.com/history/optout?hl=en\" class=gb4>Web History</a> | <a  " +
            "href=\"/preferences?hl=en\" class=gb4>Settings</a> | <a target=_top id=gb_70 " +
            "href=\"https://accounts.google.com/ServiceLogin?hl=en&continue=https://www.google.com/\" " +
            "class=gb4>Sign in</a></nobr></div><div class=gbh style=left:0></div><div class=gbh style=right:0></div>    </div>" +
            "<center><span id=\"prt\" style=\"display:block\"> <div>" +
            "<style>.pmoabs{background-color:#fff;border:1px solid #E5E5E5;color:#666;font-size:13px;padding-bottom:20px;" +
            "position:absolute;right:2px;top:3px;z-index:986}#pmolnk{border-radius:2px;-moz-border-radius:2px;" +
            "-webkit-border-radius:2px}.kd-button-submit{border:1px solid #3079ed;background-color:#4d90fe;" +
            "background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#4787ed));" +
            "background-image:-webkit-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-moz-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-ms-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-o-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:linear-gradient(top,#4d90fe,#4787ed);" +
            "filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#4787ed')}.kd-button-submit:hover{border:1px solid #2f5bb7;" +
            "background-color:#357ae8;background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#357ae8));" +
            "background-image:-webkit-linear-gradient(top,#4d90fe,#357ae8);background-image:-moz-linear-gradient(top,#4d90fe,#357ae8);" +
            "background-image:-ms-linear-gradient(top,#4d90fe,#357ae8);background-image:-o-linear-gradient(top,#4d90fe,#357ae8);" +
            "background-image:linear-gradient(top,#4d90fe,#357ae8);filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#357ae8')}.kd-button-submit:active{-webkit-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);" +
            "-moz-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);box-shadow:inset 0 1px 2px rgba(0,0,0,0.3)}#pmolnk a{color:#fff;" +
            "display:inline-block;font-weight:bold;padding:5px 20px;text-decoration:none;white-space:nowrap}.xbtn{color:#999;cursor:pointer;font-size:23px;" +
            "line-height:5px;padding-top:5px}.padi{padding:0 8px 0 10px}.padt{padding:5px 20px 0 0;color:#444}.pads{text-align:left;" +
            "max-width:200px}</style> <div class=\"pmoabs\" id=\"pmocntr2\" style=\"behavior:url(#default#userdata);display:none\"> " +
            "<table border=\"0\"> <tr> <td colspan=\"2\"> <div class=\"xbtn\" onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cpc()\" " +
            "style=\"float:right\">&times;</div> </td> </tr> <tr> <td class=\"padi\" rowspan=\"2\"> " +
            "<img src=\"/images/icons/product/chrome-48.png\"> </td> <td class=\"pads\">A faster way to browse the web</td> " +
            "</tr> <tr> <td class=\"padt\"> <div class=\"kd-button-submit\" id=\"pmolnk\"> <a href=\"/chrome/index.html?hl=en&amp;" +
            "brand=CHNG&amp;utm_source=en-hpp&amp;utm_medium=hpp&amp;utm_campaign=en\" " +
            "onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cl()\">Install Google Chrome</a> </div> </td> </tr> </table> </div> " +
            "<script type=\"text/javascript\">(function(){var a={s:{}};a.s.va=50;a.s.ra=10;a.s.aa=\"body\";a.s.Ra=!0;a.s.Ua=function(clientBuilder,c){var d=a.s.Ha();" +
            "a.s.Ja(d,clientBuilder,c);a.s.Va(d);a.s.Ra&&a.s.Sa(d)};a.s.Va=function(clientBuilder){(clientBuilder=a.s.ca(clientBuilder))&&0<clientBuilder.forms.length&&clientBuilder.forms[0].submit()};" +
            "a.s.Ha=function(){var clientBuilder=document.createElement(\"iframe\");clientBuilder.height=0;clientBuilder.width=0;clientBuilder.style.overflow=\"hidden\";" +
            "clientBuilder.style.top=clientBuilder.style.left=\"-100px\";clientBuilder.style.position=\"absolute\";document.body.appendChild(clientBuilder);return clientBuilder};" +
            "a.s.ca=function(clientBuilder){return clientBuilder.contentDocument||clientBuilder.contentWindow.document};a.s.Ja=function(clientBuilder,c,d){clientBuilder=a.s.ca(clientBuilder);" +
            "clientBuilder.open();d=[\"<\",a.s.aa,'><form method=POST action=\"',d,'\">'];" +
            "for(var e in c)c.hasOwnProperty(e)&&d.push('<textarea name=\"',e,'\">',c[e],\"</textarea>\");" +
            "d.push(\"</form></\",a.s.aa,\">\");clientBuilder.write(d.join(\"\"));clientBuilder.close()};" +
            "a.s.ea=function(clientBuilder,c){c>a.s.ra?google&&google.ml&&google.ml(Error(\"ogcdr\"),!1,{cause:\"timeout\"}):clientBuilder.contentWindow?a.s.Ta(clientBuilder):window.setTimeout(function(){a.s.ea(clientBuilder,c+1)},a.s.va)};" +
            "a.s.Ta=function(clientBuilder){document.body.removeChild(clientBuilder)};a.s.Sa=function(clientBuilder){a.s.Fa(clientBuilder,\"load\",function(){a.s.ea(clientBuilder,0)})};a.s.Fa=function(clientBuilder,c,d){clientBuilder.addEventListener?clientBuilder.addEventListener(c,d,!1):clientBuilder.attachEvent&&clientBuilder.attachEvent(\"on\"+c,d)};" +
            "var m={Ya:0,G:1,H:2,M:5};a.o={};a.o.O={na:\"i\",L:\"d\",pa:\"l\"};a.o.C={P:\"0\",I:\"1\"};a.o.R={N:1,L:2,K:3};" +
            "a.o.A={ha:\"a\",la:\"g\",F:\"c\",Ba:\"u\",Aa:\"t\",P:\"p\",ta:\"pid\",ja:\"eid\",Ca:\"at\"};" +
            "a.o.oa=window.location.protocol+\"//www.google.com/_/og/promos/\";a.o.ka=\"g\";a.o.Da=\"z\";" +
            "a.o.V=function(clientBuilder,c,d,e){var f=null;switch(c){case m.G:f=window.gbar.up.gpd(clientBuilder,d,!0);break;case m.M:f=window.gbar.up.gcc(e)}return null==f?0:parseInt(f,10)};" +
            "a.o.Na=function(clientBuilder,c,d){return c==m.G?null!=window.gbar.up.gpd(clientBuilder,d,!0):!1};a.o.S=function(clientBuilder,c,d,e,f,h,k,l){var g={};" +
            "g[a.o.A.P]=clientBuilder;g[a.o.A.la]=c;g[a.o.A.ha]=d;g[a.o.A.Ca]=e;g[a.o.A.ja]=f;g[a.o.A.ta]=1;k&&(g[a.o.A.F]=k);" +
            "l&&(g[a.o.A.Ba]=l);if(h)g[a.o.A.Aa]=h;else return google.ml(Error(\"knu\"),!1,{cause:\"Token is not found\"}),null;" +
            "return g};a.o.Y=function(clientBuilder,c,d){if(clientBuilder){var e=c?a.o.ka:a.o.Da;c&&d&&(e+=\"?authuser=\"+d);a.s.Ua(clientBuilder,a.o.oa+e)}};" +
            "a.o.Ia=function(clientBuilder,c,d,e,f,h,k){clientBuilder=a.o.S(c,clientBuilder,a.o.O.L,a.o.R.L,d,f,null,e);a.o.Y(clientBuilder,h,k)};" +
            "a.o.La=function(clientBuilder,c,d,e,f,h,k){clientBuilder=a.o.S(c,clientBuilder,a.o.O.na,a.o.R.N,d,f,e,null);a.o.Y(clientBuilder,h,k)};" +
            "a.o.Qa=function(clientBuilder,c,d,e,f,h,k,l,g,n){switch(c){case m.M:window.gbar.up.dpc(e,f);break;" +
            "case m.G:window.gbar.up.spd(clientBuilder,d,1,!0);break;case m.H:g=g||!1,l=l||\"\",h=h||0,k=k||a.o.C.I,n=n||0,a.o.Ia(e,h,k,f,l,g,n)}};" +
            "a.o.Oa=function(clientBuilder,c,d,e,f){return c==m.G?0<d&&a.o.V(clientBuilder,c,e,f)>=d:!1};" +
            "a.o.Ka=function(clientBuilder,c,d,e,f,h,k,l,g,n){switch(c){case m.M:window.gbar.up.iic(e,f);break;case m.G:c=a.o.V(clientBuilder,c,d,e)+1;" +
            "window.gbar.up.spd(clientBuilder,d,c.toString(),!0);break;case m.H:g=g||!1,l=l||\"\",h=h||0,k=k||a.o.C.P,n=n||0,a.o.La(e,h,k,1,l,g,n)}};" +
            "a.o.Pa=function(clientBuilder,c,d,e,f,h){clientBuilder=a.o.S(c,clientBuilder,a.o.O.pa,a.o.R.K,d,e,null,null);a.o.Y(clientBuilder,f,h)};" +
            "var p={Wa:\"a\",Za:\"l\",Xa:\"c\",ia:\"d\",K:\"h\",N:\"i\",jb:\"n\",I:\"x\",gb:\"ma\",hb:\"mc\",ib:\"mi\",$a:\"pa\",ab:\"pc\",cb:\"pi\",fb:\"pn\",eb:\"px\",bb:\"pd\",kb:\"gpa\",mb:\"gpi\",nb:\"gpn\",ob:\"gpx\",lb:\"gpd\"};" +
            "a.i={};a.i.w={qa:\"hplogo\",za:\"pmocntr2\"};a.i.C={ya:\"0\",I:\"1\",ga:\"2\"};" +
            "a.i.v=document.getElementById(a.i.w.za);a.i.ma=16;a.i.wa=2;a.i.xa=20;google.promos=google.promos||{};" +
            "google.promos.toast=google.promos.toast||{};a.i.J=function(clientBuilder){a.i.v&&(a.i.v.style.display=clientBuilder?\"\":\"none\",a.i.v.parentNode&&(a.i.v.parentNode.style.position=clientBuilder?\"relative\":\"\"))};" +
            "a.i.fa=function(clientBuilder){try{if(a.i.v&&clientBuilder&&clientBuilder.es&&clientBuilder.es.m){var c=window.gbar.rtl(document.body)?\"left\":\"right\";" +
            "a.i.v.style[c]=clientBuilder.es.m-a.i.ma+a.i.wa+\"px\";a.i.v.style.top=a.i.xa+\"px\"}}catch(d){google.ml(d,!1,{cause:a.i.B+\"_PT\"})}};" +
            "google.promos.toast.cl=function(){try{a.i.T==m.H&&a.o.Pa(a.i.W,a.i.D,a.i.C.ga,a.i.$,a.i.X,a.i.Z),window.gbar.up.sl(a.i.D,a.i.B,p.K,a.i.U(),1)}catch(clientBuilder){google.ml(clientBuilder,!1,{cause:a.i.B+\"_CL\"})}};" +
            "google.promos.toast.cpc=function(){try{a.i.v&&(a.i.J(!1),a.o.Qa(a.i.v,a.i.T,a.i.w.ba,a.i.W,a.i.Ga,a.i.D,a.i.C.I,a.i.$,a.i.X,a.i.Z),window.gbar.up.sl(a.i.D,a.i.B,p.ia,a.i.U(),1))}catch(clientBuilder){google.ml(clientBuilder,!1,{cause:a.i.B+\"_CPC\"})}};" +
            "a.i.da=function(){try{if(a.i.v){var clientBuilder=276,c=document.getElementById(a.i.w.qa);c&&(clientBuilder=Math.max(clientBuilder,c.offsetWidth));" +
            "var d=parseInt(a.i.v.style.right,10)||0;a.i.v.style.visibility=2*(a.i.v.offsetWidth+d)+clientBuilder>document.body.clientWidth?\"hidden\":\"\"}}catch(e){google.ml(e,!1,{cause:a.i.B+\"_HOSW\"})}};" +
            "a.i.Ea=function(){var clientBuilder=[\"gpd\",\"spd\",\"aeh\",\"sl\"];if(!window.gbar||!window.gbar.up)return!1;" +
            "for(var c=0,d;d=clientBuilder[c];c++)if(!(d in window.gbar.up))return!1;return!0};" +
            "a.i.Ma=function(){return a.i.v.currentStyle&&\"absolute\"!=a.i.v.currentStyle.position};" +
            "google.promos.toast.init=function(clientBuilder,c,d,e,f,h,k,l,g,n,q,r){try{a.i.Ea()?a.i.v&&(e==m.H&&!l==!g?" +
            "(google.ml(Error(\"tku\"),!1,{cause:\"zwieback: \"+g+\", gaia: \"+l})," +
            "a.i.J(!1)):(a.i.w.F=\"toast_count_\"+c+(q?\"_\"+q:\"\"),a.i.w.ba=\"toast_dp_\"+c+(r?\"_\"+r:\"\")," +
            "a.i.B=d,a.i.D=clientBuilder,a.i.T=e,a.i.W=c,a.i.Ga=f,a.i.$=l?l:g,a.i.X=!!l,a.i.Z=k," +
            "a.o.Na(a.i.v,e,a.i.w.ba,c)||a.o.Oa(a.i.v,e,h,a.i.w.F,c)||a.i.Ma()?a.i.J(!1):(a.o.Ka(a.i.v,e,a.i.w.F,c,f,a.i.D,a.i.C.ya,a.i.$,a.i.X,a.i.Z),n||(window.gbar.up.aeh(window,\"resize\",a.i.da)," +
            "window.lol=a.i.da,window.gbar.elr&&a.i.fa(window.gbar.elr()),window.gbar.elc&&window.gbar.elc(a.i.fa),a.i.J(!0))," +
            "window.gbar.up.sl(a.i.D,a.i.B,p.N,a.i.U())))):google.ml(Error(\"apa\"),!1,{cause:a.i.B+\"_INIT\"})}catch(t){google.ml(t,!1,{cause:a.i.B+\"_INIT\"})}};" +
            "a.i.U=function(){var clientBuilder=a.o.V(a.i.v,a.i.T,a.i.w.F,a.i.W);return\"ic=\"+clientBuilder};})();" +
            "</script> <script type=\"text/javascript\">(function(){var sourceWebappPromoID=144002;var sourceWebappGroupID=5;var payloadType=5;" +
            "var cookieMaxAgeSec=2592000;var dismissalType=5;var impressionCap=25;var gaiaXsrfToken='';var zwbkXsrfToken='';" +
            "var kansasDismissalEnabled=false;var sessionIndex=0;" +
            "var invisible=false;window.gbar&&gbar.up&&gbar.up.r&&gbar.up.r(payloadType," +
            "function(show){if (show){google.promos.toast.init(sourceWebappPromoID,sourceWebappGroupID,payloadType,dismissalType,cookieMaxAgeSec,impressionCap,sessionIndex,gaiaXsrfToken,zwbkXsrfToken,invisible,'0612');}\n" +
            "});})();</script> </div> </span><br clear=\"all\" id=\"lgpd\"><div id=\"lga\"><img alt=\"Google\" " +
            "height=\"95\" src=\"/images/srpr/logo9w.png\" style=\"padding:28px 0 14px\" width=\"269\" " +
            "id=\"hplogo\" onload=\"window.lol&&lol()\"><br><br></div><form action=\"/search\" name=\"f\">" +
            "<table cellpadding=\"0\" cellspacing=\"0\"><tr valign=\"top\"><td width=\"25%\">&nbsp;</td>" +
            "<td align=\"center\" nowrap=\"\"><input name=\"ie\" value=\"ISO-8859-1\" type=\"hidden\">" +
            "<input value=\"en\" name=\"hl\" type=\"hidden\"><input name=\"source\" type=\"hidden\" value=\"hp\">" +
            "<div class=\"ds\" style=\"height:32px;margin:4px 0\">" +
            "<input style=\"color:#000;margin:0;padding:5px 8px 0 6px;vertical-align:top\" autocomplete=\"off\" class=\"lst\" value=\"\" " +
            "title=\"Google Search\" maxlength=\"2048\" name=\"q\" size=\"57\"></div><br style=\"line-height:0\">" +
            "<span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" value=\"Google Search\" name=\"btnG\" " +
            "type=\"submit\"></span></span><span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" " +
            "value=\"I'm Feeling Lucky\" name=\"btnI\" onclick=\"if(this.form.q.value)this.checked=1; " +
            "else top.location='/doodles/'\" type=\"submit\"></span></span></td><td class=\"fl sblc\" " +
            "align=\"left\" nowrap=\"\" width=\"25%\"><a href=\"/advanced_search?hl=en&amp;authuser=0\">Advanced search</a>" +
            "<a href=\"/language_tools?hl=en&amp;authuser=0\">Language tools</a></td></tr></table>" +
            "<input id=\"gbv\" name=\"gbv\" type=\"hidden\" value=\"1\"></form><div id=\"gac_scont\"></div>" +
            "<div style=\"font-size:83%;min-height:3.5em\"><br></div><span id=\"footer\"><div style=\"font-size:10pt\">" +
            "<div style=\"margin:19px auto;text-align:center\" id=\"fll\"><a href=\"/intl/en/ads/\">Advertising&nbsp;Programs</a>" +
            "<a href=\"/services/\">Business Solutions</a><a href=\"https://plus.google.com/116899029375914044550\" rel=\"publisher\">+Google</a>" +
            "<a href=\"/intl/en/about.html\">About Google</a></div></div><p style=\"color:#767676;font-size:8pt\">&copy; 2015 - " +
            "<a href=\"/intl/en/policies/privacy/\">Privacy</a> - <a href=\"/intl/en/policies/terms/\">Terms</a></p>" +
            "</span></center><div id=\"xjsd\"></div><div id=\"xjsi\" data-jiis=\"bp\"><script>" +
            "(function(){function c(clientBuilder){window.setTimeout(function(){var a=document.createElement(\"script\");" +
            "a.src=clientBuilder;document.getElementById(\"xjsd\").appendChild(a)},0)}google.dljp=function(clientBuilder,a){google.xjsu=clientBuilder;" +
            "c(a)};google.dlj=c;})();(function(){window.google.xjsrm=[];})();if(google.y)google.y.first=[];" +
            "if(!google.xjs){window._=window._||{};window._._DumpException=function(e){throw e};" +
            "if(google.timers&&google.timers.load.t){google.timers.load.t.xjsls=new Date().getTime();" +
            "}google.dljp('/xjs/_/js/k\\x3dxjs.hp.en_US.tZLNZEZoxn0.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oElRkmkJaNVXMG7Zfxu73TpQ3NM6w'," +
            "'/xjs/_/js/k\\x3dxjs.hp.en_US.tZLNZEZoxn0.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oElRkmkJaNVXMG7Zfxu73TpQ3NM6w');" +
            "google.xjs=1;}google.pmc={\"sb_he\":{\"agen\":true,\"cgen\":true,\"client\":\"heirloom-hp\",\"dh\":true,\"ds\":\"\",\"exp\":\"msedr\"," +
            "\"fl\":true,\"host\":\"google.com\",\"jam\":0,\"jsonp\":true,\"msgs\":{\"cibl\":\"Clear Search\"," +
            "\"dym\":\"Did you mean:\",\"lcky\":\"I\\u0026#39;m Feeling Lucky\",\"lml\":\"Learn more\",\"oskt\":\"Input tools\"," +
            "\"psrc\":\"This search was removed from your \\u003Ca href=\\\"/history\\\"\\u003EWeb History\\u003C/a\\u003E\"," +
            "\"psrl\":\"Remove\",\"sbit\":\"Search by image\",\"srch\":\"Google Search\"},\"ovr\":{},\"pq\":\"\",\"refoq\":true," +
            "\"refpd\":true,\"rfs\":[],\"scd\":10,\"sce\":5,\"stok\":\"2pahtS7BxHcl2DialqQZRYdgEl8\"},\"d\":{}};" +
            "google.y.first.push(function(){if(google.med){google.med('init');google.initHistory();" +
            "google.med('history');}});if(google.j&&google.j.en&&google.j.xi){window.setTimeout(google.j.xi,0);}\n" +
            "</script></div></body></html>";

    @SuppressWarnings("unused")
    public static final String CANNED_GOOGLE_RESPONSE2 = "<!doctype html><html itemscope=\"\" " +
            "itemtype=\"http://schema.org/WebPage\" lang=\"en\">" +
            "<head><meta content=\"Search the world's information, including webpages, images, videos and more. " +
            "Google has many special features to help you find exactly what you're looking for.\" name=\"description\">" +
            "<meta content=\"noodp\" name=\"robots\"><meta content=\"/images/google_favicon_128.png\" " +
            "itemprop=\"image\"><title>Google</title>" +
            "<script>(function(){window.google={kEI:'_-5YVYj1J4a9sAX2y4DIBg',kEXPI:'18168,3700286,3700366,4017578," +
            "4024036,4026111,4029403,4029815,4030092,4031182,4031637,4032500,4032522,4032643,4032645,4032677,4033143," +
            "4033191,4033243,4033256,4033344,4033372,4034322,4034425,4035816,4035980,4036305,4036436,4036486,4036532," +
            "4036800,8500394,8501248,8501280,8501294,8501350,8501406,8501489,10200083,10200980,10201180'," +
            "authuser:0,kSID:'c9c918f0_10'};google.kHL='en';})();(function(){google.lc=[];google.li=0;" +
            "google.getEI=function(a){for(var clientBuilder;a&&(!a.getAttribute||!(clientBuilder=a.getAttribute(\"eid\")));)a=a.parentNode;" +
            "return clientBuilder||google.kEI};google.getLEI=function(a){for(var clientBuilder=null;a&&(!a.getAttribute||!(clientBuilder=a.getAttribute(\"leid\")));)a=a.parentNode;" +
            "return clientBuilder};google.https=function(){return\"https:\"==window.location.protocol};google.ml=function(){};" +
            "google.time=function(){return(new Date).getTime()};google.log=function(a,clientBuilder,e,f,l){var d=new Image,h=google.lc,g=google.li,c=\"\",m=google.ls||\"\";" +
            "d.onerror=d.onload=d.onabort=function(){delete h[g]};h[g]=d;" +
            "if(!e&&-1==clientBuilder.search(\"&ei=\")){var k=google.getEI(f),c=\"&ei=\"+k;-1==clientBuilder.search(\"&lei=\")&&" +
            "((f=google.getLEI(f))?c+=\"&lei=\"+f:k!=google.kEI&&(c+=\"&lei=\"+google.kEI))}a=e||\"/\"+(l||\"gen_204\")+\"?atyp=i&ct=\"+a+\"&cad=\"+clientBuilder+c+m+\"&zx=\"+google.time();" +
            "/^http:/i.test(a)&&google.https()?(google.ml(Error(\"a\"),!1,{src:a,glmm:1}),delete h[g]):(window.google&&window.google.vel&&\n" +
            "window.google.vel.lu&&window.google.vel.lu(a),d.src=a,google.li=g+1)};google.y={};google.x=function(a,clientBuilder){google.y[a.id]=[a,clientBuilder];return!1};" +
            "google.load=function(a,clientBuilder,e){google.x({id:a+n++},function(){google.load(a,clientBuilder,e)})};var n=0;})();" +
            "google.kCSI={};var _gjwl=location;function _gjuc(){var a=_gjwl.href.indexOf(\"#\");" +
            "if(0<=a&&(a=_gjwl.href.substring(a),0<a.indexOf(\"&q=\")||0<=a.indexOf(\"#q=\"))&&(a=a.substring(1),-1==a.indexOf(\"#\"))){for(var d=0;d<a.length;){var clientBuilder=d;\"&\"==a.charAt(clientBuilder)&&++clientBuilder;" +
            "var c=a.indexOf(\"&\",clientBuilder);-1==c&&(c=a.length);clientBuilder=a.substring(clientBuilder,c);if(0==clientBuilder.indexOf(\"fp=\"))a=a.substring(0,d)+a.substring(c,a.length),c=d;" +
            "else if(\"cad=h\"==clientBuilder)return 0;d=c}_gjwl.href=\"/search?\"+a+\"&cad=h\";return 1}return 0}\n" +
            "function _gjh(){!_gjuc()&&window.google&&google.x&&google.x({id:\"GJH\"},function(){google.nav&&google.nav.gjh&&google.nav.gjh()})};" +
            "window._gjh&&_gjh();</script><style>#gbar,#guser{font-size:13px;padding-top:1px !important;}#gbar{height:22px}#guser{padding-bottom:7px !important;" +
            "text-align:right}.gbh,.gbd{border-top:1px solid #c9d7f1;font-size:1px}.gbh{height:0;position:absolute;top:24px;width:100%}@media all{.gb1{height:22px;margin-right:.5em;" +
            "vertical-align:top}#gbar{float:left}}a.gb1,a.gb4{text-decoration:underline !important}a.gb1,a.gb4{color:#00c !important}.gbi .gb4{color:#dd8e27 !important}.gbf .gb4{color:#900 !important}</style>" +
            "<style>body,td,a,p,.h{font-family:arial,sans-serif}body{margin:0;overflow-y:scroll}#gog{padding:3px 8px 0}td{line-height:.8em}.gac_m " +
            "td{line-height:17px}form{margin-bottom:20px}.h{color:#36c}.q{color:#00c}.ts td{padding:0}.ts{border-collapse:collapse}em{font-weight:bold;" +
            "font-style:normal}.lst{height:25px;width:496px}.gsfi,.lst{font:18px arial,sans-serif}.gsfs{font:17px arial,sans-serif}.ds{display:inline-box;" +
            "display:inline-block;margin:3px 0 4px;margin-left:4px}input{font-family:inherit}a.gb1,a.gb2,a.gb3,a.gb4{color:#11c " +
            "!important}body{background:#fff;color:black}a{color:#11c;text-decoration:none}a:hover," +
            "a:active{text-decoration:underline}.fl a{color:#36c}a:visited{color:#551a8b}a.gb1,a.gb4{text-decoration:underline}a.gb3:hover{text-decoration:none}#ghead " +
            "a.gb2:hover{color:#fff !important}.sblc{padding-top:5px}.sblc a{display:block;margin:2px 0;margin-left:13px;font-size:11px}.lsbb{background:#eee;border:solid " +
            "1px;border-color:#ccc #999 #999 #ccc;height:30px}.lsbb{display:block}.ftl,#fll a{display:inline-block;margin:0 12px}.lsb{background:url(/images/srpr/nav_logo80.png) " +
            "0 -258px repeat-x;border:none;color:#000;cursor:pointer;height:30px;margin:0;outline:0;font:15px arial,sans-serif;vertical-align:top}.lsb:active{background:#ccc}.lst:focus{outline:none}</style>" +
            "<script></script></head><body bgcolor=\"#fff\"><script>(function(){var src='/images/nav_logo199.png';var iesg=false;" +
            "document.body.onload = function(){window.n && window.n();if (document.images){new Image().src=src;}\n" +
            "if (!iesg){document.f&&document.f.q.focus();document.gbqf&&document.gbqf.q.focus();}\n" +
            "}\n" +
            "})();</script><div id=\"mngb\">    <div id=gbar><nobr><clientBuilder class=gb1>Search</clientBuilder> <a class=gb1 " +
            "href=\"https://www.google.com/imghp?hl=en&tab=wi\">Images</a> <a class=gb1 " +
            "href=\"https://maps.google.com/maps?hl=en&tab=wl\">Maps</a> <a class=gb1 " +
            "href=\"https://play.google.com/?hl=en&tab=w8\">Play</a> <a class=gb1 " +
            "href=\"https://www.youtube.com/?tab=w1\">YouTube</a> <a class=gb1 " +
            "href=\"https://news.google.com/nwshp?hl=en&tab=wn\">News</a> " +
            "<a class=gb1 href=\"https://mail.google.com/mail/?tab=wm\">Gmail</a> <a class=gb1 " +
            "href=\"https://drive.google.com/?tab=wo\">Drive</a> " +
            "<a class=gb1 style=\"text-decoration:none\" href=\"http://www.google.com/intl/en/options/\"><u>More</u> &raquo;</a>" +
            "</nobr></div><div id=guser width=100%><nobr><span id=gbn class=gbi></span><span id=gbf class=gbf></span>" +
            "<span id=gbe></span><a href=\"http://www.google.com/history/optout?hl=en\" class=gb4>Web History</a> | <a  " +
            "href=\"/preferences?hl=en\" class=gb4>Settings</a> | <a target=_top id=gb_70 " +
            "href=\"https://accounts.google.com/ServiceLogin?hl=en&continue=https://www.google.com/\" " +
            "class=gb4>Sign in</a></nobr></div><div class=gbh style=left:0></div><div class=gbh style=right:0></div>    </div>" +
            "<center><span id=\"prt\" style=\"display:block\"> <div>" +
            "<style>.pmoabs{background-color:#fff;border:1px solid #E5E5E5;color:#666;font-size:13px;padding-bottom:20px;" +
            "position:absolute;right:2px;top:3px;z-index:986}#pmolnk{border-radius:2px;-moz-border-radius:2px;" +
            "-webkit-border-radius:2px}.kd-button-submit{border:1px solid #3079ed;background-color:#4d90fe;" +
            "background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#4787ed));" +
            "background-image:-webkit-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-moz-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-ms-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:-o-linear-gradient(top,#4d90fe,#4787ed);" +
            "background-image:linear-gradient(top,#4d90fe,#4787ed);" +
            "filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#4787ed')}.kd-button-submit:hover{border:1px solid #2f5bb7;" +
            "background-color:#357ae8;background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#357ae8));" +
            "background-image:-webkit-linear-gradient(top,#4d90fe,#357ae8);background-image:-moz-linear-gradient(top,#4d90fe,#357ae8);" +
            "background-image:-ms-linear-gradient(top,#4d90fe,#357ae8);background-image:-o-linear-gradient(top,#4d90fe,#357ae8);" +
            "background-image:linear-gradient(top,#4d90fe,#357ae8);filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#357ae8')}.kd-button-submit:active{-webkit-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);" +
            "-moz-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);box-shadow:inset 0 1px 2px rgba(0,0,0,0.3)}#pmolnk a{color:#fff;" +
            "display:inline-block;font-weight:bold;padding:5px 20px;text-decoration:none;white-space:nowrap}.xbtn{color:#999;cursor:pointer;font-size:23px;" +
            "line-height:5px;padding-top:5px}.padi{padding:0 8px 0 10px}.padt{padding:5px 20px 0 0;color:#444}.pads{text-align:left;" +
            "max-width:200px}</style> <div class=\"pmoabs\" id=\"pmocntr2\" style=\"behavior:url(#default#userdata);display:none\"> " +
            "<table border=\"0\"> <tr> <td colspan=\"2\"> <div class=\"xbtn\" onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cpc()\" " +
            "style=\"float:right\">&times;</div> </td> </tr> <tr> <td class=\"padi\" rowspan=\"2\"> " +
            "<img src=\"/images/icons/product/chrome-48.png\"> </td> <td class=\"pads\">A faster way to browse the web</td> " +
            "</tr> <tr> <td class=\"padt\"> <div class=\"kd-button-submit\" id=\"pmolnk\"> <a href=\"/chrome/index.html?hl=en&amp;" +
            "brand=CHNG&amp;utm_source=en-hpp&amp;utm_medium=hpp&amp;utm_campaign=en\" " +
            "onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cl()\">Install Google Chrome</a> </div> </td> </tr> </table> </div> " +
            "<script type=\"text/javascript\">(function(){var a={s:{}};a.s.va=50;a.s.ra=10;a.s.aa=\"body\";a.s.Ra=!0;a.s.Ua=function(clientBuilder,c){var d=a.s.Ha();" +
            "a.s.Ja(d,clientBuilder,c);a.s.Va(d);a.s.Ra&&a.s.Sa(d)};a.s.Va=function(clientBuilder){(clientBuilder=a.s.ca(clientBuilder))&&0<clientBuilder.forms.length&&clientBuilder.forms[0].submit()};" +
            "a.s.Ha=function(){var clientBuilder=document.createElement(\"iframe\");clientBuilder.height=0;clientBuilder.width=0;clientBuilder.style.overflow=\"hidden\";" +
            "clientBuilder.style.top=clientBuilder.style.left=\"-100px\";clientBuilder.style.position=\"absolute\";document.body.appendChild(clientBuilder);return clientBuilder};" +
            "a.s.ca=function(clientBuilder){return clientBuilder.contentDocument||clientBuilder.contentWindow.document};a.s.Ja=function(clientBuilder,c,d){clientBuilder=a.s.ca(clientBuilder);" +
            "clientBuilder.open();d=[\"<\",a.s.aa,'><form method=POST action=\"',d,'\">'];" +
            "for(var e in c)c.hasOwnProperty(e)&&d.push('<textarea name=\"',e,'\">',c[e],\"</textarea>\");" +
            "d.push(\"</form></\",a.s.aa,\">\");clientBuilder.write(d.join(\"\"));clientBuilder.close()};" +
            "a.s.ea=function(clientBuilder,c){c>a.s.ra?google&&google.ml&&google.ml(Error(\"ogcdr\"),!1,{cause:\"timeout\"}):clientBuilder.contentWindow?a.s.Ta(clientBuilder):window.setTimeout(function(){a.s.ea(clientBuilder,c+1)},a.s.va)};" +
            "a.s.Ta=function(clientBuilder){document.body.removeChild(clientBuilder)};a.s.Sa=function(clientBuilder){a.s.Fa(clientBuilder,\"load\",function(){a.s.ea(clientBuilder,0)})};a.s.Fa=function(clientBuilder,c,d){clientBuilder.addEventListener?clientBuilder.addEventListener(c,d,!1):clientBuilder.attachEvent&&clientBuilder.attachEvent(\"on\"+c,d)};" +
            "var m={Ya:0,G:1,H:2,M:5};a.o={};a.o.O={na:\"i\",L:\"d\",pa:\"l\"};a.o.C={P:\"0\",I:\"1\"};a.o.R={N:1,L:2,K:3};" +
            "a.o.A={ha:\"a\",la:\"g\",F:\"c\",Ba:\"u\",Aa:\"t\",P:\"p\",ta:\"pid\",ja:\"eid\",Ca:\"at\"};" +
            "a.o.oa=window.location.protocol+\"//www.google.com/_/og/promos/\";a.o.ka=\"g\";a.o.Da=\"z\";" +
            "a.o.V=function(clientBuilder,c,d,e){var f=null;switch(c){case m.G:f=window.gbar.up.gpd(clientBuilder,d,!0);break;case m.M:f=window.gbar.up.gcc(e)}return null==f?0:parseInt(f,10)};" +
            "a.o.Na=function(clientBuilder,c,d){return c==m.G?null!=window.gbar.up.gpd(clientBuilder,d,!0):!1};a.o.S=function(clientBuilder,c,d,e,f,h,k,l){var g={};" +
            "g[a.o.A.P]=clientBuilder;g[a.o.A.la]=c;g[a.o.A.ha]=d;g[a.o.A.Ca]=e;g[a.o.A.ja]=f;g[a.o.A.ta]=1;k&&(g[a.o.A.F]=k);" +
            "l&&(g[a.o.A.Ba]=l);if(h)g[a.o.A.Aa]=h;else return google.ml(Error(\"knu\"),!1,{cause:\"Token is not found\"}),null;" +
            "return g};a.o.Y=function(clientBuilder,c,d){if(clientBuilder){var e=c?a.o.ka:a.o.Da;c&&d&&(e+=\"?authuser=\"+d);a.s.Ua(clientBuilder,a.o.oa+e)}};" +
            "a.o.Ia=function(clientBuilder,c,d,e,f,h,k){clientBuilder=a.o.S(c,clientBuilder,a.o.O.L,a.o.R.L,d,f,null,e);a.o.Y(clientBuilder,h,k)};" +
            "a.o.La=function(clientBuilder,c,d,e,f,h,k){clientBuilder=a.o.S(c,clientBuilder,a.o.O.na,a.o.R.N,d,f,e,null);a.o.Y(clientBuilder,h,k)};" +
            "a.o.Qa=function(clientBuilder,c,d,e,f,h,k,l,g,n){switch(c){case m.M:window.gbar.up.dpc(e,f);break;" +
            "case m.G:window.gbar.up.spd(clientBuilder,d,1,!0);break;case m.H:g=g||!1,l=l||\"\",h=h||0,k=k||a.o.C.I,n=n||0,a.o.Ia(e,h,k,f,l,g,n)}};" +
            "a.o.Oa=function(clientBuilder,c,d,e,f){return c==m.G?0<d&&a.o.V(clientBuilder,c,e,f)>=d:!1};" +
            "a.o.Ka=function(clientBuilder,c,d,e,f,h,k,l,g,n){switch(c){case m.M:window.gbar.up.iic(e,f);break;case m.G:c=a.o.V(clientBuilder,c,d,e)+1;" +
            "window.gbar.up.spd(clientBuilder,d,c.toString(),!0);break;case m.H:g=g||!1,l=l||\"\",h=h||0,k=k||a.o.C.P,n=n||0,a.o.La(e,h,k,1,l,g,n)}};" +
            "a.o.Pa=function(clientBuilder,c,d,e,f,h){clientBuilder=a.o.S(c,clientBuilder,a.o.O.pa,a.o.R.K,d,e,null,null);a.o.Y(clientBuilder,f,h)};" +
            "var p={Wa:\"a\",Za:\"l\",Xa:\"c\",ia:\"d\",K:\"h\",N:\"i\",jb:\"n\",I:\"x\",gb:\"ma\",hb:\"mc\",ib:\"mi\",$a:\"pa\",ab:\"pc\",cb:\"pi\",fb:\"pn\",eb:\"px\",bb:\"pd\",kb:\"gpa\",mb:\"gpi\",nb:\"gpn\",ob:\"gpx\",lb:\"gpd\"};" +
            "a.i={};a.i.w={qa:\"hplogo\",za:\"pmocntr2\"};a.i.C={ya:\"0\",I:\"1\",ga:\"2\"};" +
            "a.i.v=document.getElementById(a.i.w.za);a.i.ma=16;a.i.wa=2;a.i.xa=20;google.promos=google.promos||{};" +
            "google.promos.toast=google.promos.toast||{};a.i.J=function(clientBuilder){a.i.v&&(a.i.v.style.display=clientBuilder?\"\":\"none\",a.i.v.parentNode&&(a.i.v.parentNode.style.position=clientBuilder?\"relative\":\"\"))};" +
            "a.i.fa=function(clientBuilder){try{if(a.i.v&&clientBuilder&&clientBuilder.es&&clientBuilder.es.m){var c=window.gbar.rtl(document.body)?\"left\":\"right\";" +
            "a.i.v.style[c]=clientBuilder.es.m-a.i.ma+a.i.wa+\"px\";a.i.v.style.top=a.i.xa+\"px\"}}catch(d){google.ml(d,!1,{cause:a.i.B+\"_PT\"})}};" +
            "google.promos.toast.cl=function(){try{a.i.T==m.H&&a.o.Pa(a.i.W,a.i.D,a.i.C.ga,a.i.$,a.i.X,a.i.Z),window.gbar.up.sl(a.i.D,a.i.B,p.K,a.i.U(),1)}catch(clientBuilder){google.ml(clientBuilder,!1,{cause:a.i.B+\"_CL\"})}};" +
            "google.promos.toast.cpc=function(){try{a.i.v&&(a.i.J(!1),a.o.Qa(a.i.v,a.i.T,a.i.w.ba,a.i.W,a.i.Ga,a.i.D,a.i.C.I,a.i.$,a.i.X,a.i.Z),window.gbar.up.sl(a.i.D,a.i.B,p.ia,a.i.U(),1))}catch(clientBuilder){google.ml(clientBuilder,!1,{cause:a.i.B+\"_CPC\"})}};" +
            "a.i.da=function(){try{if(a.i.v){var clientBuilder=276,c=document.getElementById(a.i.w.qa);c&&(clientBuilder=Math.max(clientBuilder,c.offsetWidth));" +
            "var d=parseInt(a.i.v.style.right,10)||0;a.i.v.style.visibility=2*(a.i.v.offsetWidth+d)+clientBuilder>document.body.clientWidth?\"hidden\":\"\"}}catch(e){google.ml(e,!1,{cause:a.i.B+\"_HOSW\"})}};" +
            "a.i.Ea=function(){var clientBuilder=[\"gpd\",\"spd\",\"aeh\",\"sl\"];if(!window.gbar||!window.gbar.up)return!1;" +
            "for(var c=0,d;d=clientBuilder[c];c++)if(!(d in window.gbar.up))return!1;return!0};" +
            "a.i.Ma=function(){return a.i.v.currentStyle&&\"absolute\"!=a.i.v.currentStyle.position};" +
            "google.promos.toast.init=function(clientBuilder,c,d,e,f,h,k,l,g,n,q,r){try{a.i.Ea()?a.i.v&&(e==m.H&&!l==!g?" +
            "(google.ml(Error(\"tku\"),!1,{cause:\"zwieback: \"+g+\", gaia: \"+l})," +
            "a.i.J(!1)):(a.i.w.F=\"toast_count_\"+c+(q?\"_\"+q:\"\"),a.i.w.ba=\"toast_dp_\"+c+(r?\"_\"+r:\"\")," +
            "a.i.B=d,a.i.D=clientBuilder,a.i.T=e,a.i.W=c,a.i.Ga=f,a.i.$=l?l:g,a.i.X=!!l,a.i.Z=k," +
            "a.o.Na(a.i.v,e,a.i.w.ba,c)||a.o.Oa(a.i.v,e,h,a.i.w.F,c)||a.i.Ma()?a.i.J(!1):(a.o.Ka(a.i.v,e,a.i.w.F,c,f,a.i.D,a.i.C.ya,a.i.$,a.i.X,a.i.Z),n||(window.gbar.up.aeh(window,\"resize\",a.i.da)," +
            "window.lol=a.i.da,window.gbar.elr&&a.i.fa(window.gbar.elr()),window.gbar.elc&&window.gbar.elc(a.i.fa),a.i.J(!0))," +
            "window.gbar.up.sl(a.i.D,a.i.B,p.N,a.i.U())))):google.ml(Error(\"apa\"),!1,{cause:a.i.B+\"_INIT\"})}catch(t){google.ml(t,!1,{cause:a.i.B+\"_INIT\"})}};" +
            "a.i.U=function(){var clientBuilder=a.o.V(a.i.v,a.i.T,a.i.w.F,a.i.W);return\"ic=\"+clientBuilder};})();" +
            "</script> <script type=\"text/javascript\">(function(){var sourceWebappPromoID=144002;var sourceWebappGroupID=5;var payloadType=5;" +
            "var cookieMaxAgeSec=2592000;var dismissalType=5;var impressionCap=25;var gaiaXsrfToken='';var zwbkXsrfToken='';" +
            "var kansasDismissalEnabled=false;var sessionIndex=0;" +
            "var invisible=false;window.gbar&&gbar.up&&gbar.up.r&&gbar.up.r(payloadType," +
            "function(show){if (show){google.promos.toast.init(sourceWebappPromoID,sourceWebappGroupID,payloadType,dismissalType,cookieMaxAgeSec,impressionCap,sessionIndex,gaiaXsrfToken,zwbkXsrfToken,invisible,'0612');}\n" +
            "});})();</script> </div> </span><br clear=\"all\" id=\"lgpd\"><div id=\"lga\"><img alt=\"Google\" " +
            "height=\"95\" src=\"/images/srpr/logo9w.png\" style=\"padding:28px 0 14px\" width=\"269\" " +
            "id=\"hplogo\" onload=\"window.lol&&lol()\"><br><br></div><form action=\"/search\" name=\"f\">" +
            "<table cellpadding=\"0\" cellspacing=\"0\"><tr valign=\"top\"><td width=\"25%\">&nbsp;</td>" +
            "<td align=\"center\" nowrap=\"\"><input name=\"ie\" value=\"ISO-8859-1\" type=\"hidden\">" +
            "<input value=\"en\" name=\"hl\" type=\"hidden\"><input name=\"source\" type=\"hidden\" value=\"hp\">" +
            "<div class=\"ds\" style=\"height:32px;margin:4px 0\">" +
            "<input style=\"color:#000;margin:0;padding:5px 8px 0 6px;vertical-align:top\" autocomplete=\"off\" class=\"lst\" value=\"\" " +
            "title=\"Google Search\" maxlength=\"2048\" name=\"q\" size=\"57\"></div><br style=\"line-height:0\">" +
            "<span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" value=\"Google Search\" name=\"btnG\" " +
            "type=\"submit\"></span></span><span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" " +
            "value=\"I'm Feeling Lucky\" name=\"btnI\" onclick=\"if(this.form.q.value)this.checked=1; " +
            "else top.location='/doodles/'\" type=\"submit\"></span></span></td><td class=\"fl sblc\" " +
            "align=\"left\" nowrap=\"\" width=\"25%\"><a href=\"/advanced_search?hl=en&amp;authuser=0\">Advanced search</a>" +
            "<a href=\"/language_tools?hl=en&amp;authuser=0\">Language tools</a></td></tr></table>" +
            "<input id=\"gbv\" name=\"gbv\" type=\"hidden\" value=\"1\"></form><div id=\"gac_scont\"></div>" +
            "<div style=\"font-size:83%;min-height:3.5em\"><br></div><span id=\"footer\"><div style=\"font-size:10pt\">" +
            "<div style=\"margin:19px auto;text-align:center\" id=\"fll\"><a href=\"/intl/en/ads/\">Advertising&nbsp;Programs</a>" +
            "<a href=\"/services/\">Business Solutions</a><a href=\"https://plus.google.com/116899029375914044550\" rel=\"publisher\">+Google</a>" +
            "<a href=\"/intl/en/about.html\">About Google</a></div></div><p style=\"color:#767676;font-size:8pt\">&copy; 2015 - " +
            "<a href=\"/intl/en/policies/privacy/\">Privacy</a> - <a href=\"/intl/en/policies/terms/\">Terms</a></p>" +
            "</span></center><div id=\"xjsd\"></div><div id=\"xjsi\" data-jiis=\"bp\"><script>" +
            "(function(){function c(clientBuilder){window.setTimeout(function(){var a=document.createElement(\"script\");" +
            "a.src=clientBuilder;document.getElementById(\"xjsd\").appendChild(a)},0)}google.dljp=function(clientBuilder,a){google.xjsu=clientBuilder;" +
            "c(a)};google.dlj=c;})();(function(){window.google.xjsrm=[];})();if(google.y)google.y.first=[];" +
            "if(!google.xjs){window._=window._||{};window._._DumpException=function(e){throw e};" +
            "if(google.timers&&google.timers.load.t){google.timers.load.t.xjsls=new Date().getTime();" +
            "}google.dljp('/xjs/_/js/k\\x3dxjs.hp.en_US.tZLNZEZoxn0.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oElRkmkJaNVXMG7Zfxu73TpQ3NM6w'," +
            "'/xjs/_/js/k\\x3dxjs.hp.en_US.tZLNZEZoxn0.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oElRkmkJaNVXMG7Zfxu73TpQ3NM6w');" +
            "google.xjs=1;}google.pmc={\"sb_he\":{\"agen\":true,\"cgen\":true,\"client\":\"heirloom-hp\",\"dh\":true,\"ds\":\"\",\"exp\":\"msedr\"," +
            "\"fl\":true,\"host\":\"google.com\",\"jam\":0,\"jsonp\":true,\"msgs\":{\"cibl\":\"Clear Search\"," +
            "\"dym\":\"Did you mean:\",\"lcky\":\"I\\u0026#39;m Feeling Lucky\",\"lml\":\"Learn more\",\"oskt\":\"Input tools\"," +
            "\"psrc\":\"This search was removed from your \\u003Ca href=\\\"/history\\\"\\u003EWeb History\\u003C/a\\u003E\"," +
            "\"psrl\":\"Remove\",\"sbit\":\"Search by image\",\"srch\":\"Google Search\"},\"ovr\":{},\"pq\":\"\",\"refoq\":true," +
            "\"refpd\":true,\"rfs\":[],\"scd\":10,\"sce\":5,\"stok\":\"2pahtS7BxHcl2DialqQZRYdgEl8\"},\"d\":{}};" +
            "google.y.first.push(function(){if(google.med){google.med('init');google.initHistory();" +
            "google.med('history');}});if(google.j&&google.j.en&&google.j.xi){window.setTimeout(google.j.xi,0);}\n" +
            "</script></div></body></html>";
}

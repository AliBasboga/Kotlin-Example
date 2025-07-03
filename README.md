<div data-state="active" data-orientation="horizontal" role="tabpanel" aria-labelledby="radix-:r15:-trigger-preview" id="radix-:r15:-content-preview" tabindex="0" class="mt-2 ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2" style=""><div class="border border-border rounded-lg bg-background p-6 shadow-sm"><div class="prose prose-sm md:prose-base lg:prose-lg max-w-none prose-headings:font-bold prose-a:text-blue-600" style="user-select: none;"><div id="top" class="">

<div align="center" class="text-center">
<h1><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">KOTLIN-ÖRNEĞİ</font></font></h1>
<p><em><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kusursuz Kotlin Mükemmelliğiyle Yeniliği Güçlendirmek</font></font></em></p>

<img alt="son-işlem" src="https://img.shields.io/github/last-commit/AliBasboga/Kotlin-Example?style=flat&amp;logo=git&amp;logoColor=white&amp;color=0080ff" class="inline-block mx-1" style="margin: 0px 2px;">
<img alt="depo-üst-dil" src="https://img.shields.io/github/languages/top/AliBasboga/Kotlin-Example?style=flat&amp;color=0080ff" class="inline-block mx-1" style="margin: 0px 2px;">
<img alt="depo-dil-sayısı" src="https://img.shields.io/github/languages/count/AliBasboga/Kotlin-Example?style=flat&amp;color=0080ff" class="inline-block mx-1" style="margin: 0px 2px;">
<p><em><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Aşağıdaki araçlar ve teknolojilerle oluşturulmuştur:</font></font></em></p>
<img alt="Gradle" src="https://img.shields.io/badge/Gradle-02303A.svg?style=flat&amp;logo=Gradle&amp;logoColor=white" class="inline-block mx-1" style="margin: 0px 2px;">
<img alt="xml" src="https://img.shields.io/badge/XML-005FAD.svg?style=flat&amp;logo=XML&amp;logoColor=white" class="inline-block mx-1" style="margin: 0px 2px;">
<img alt="yarasa" src="https://img.shields.io/badge/bat-31369E.svg?style=flat&amp;logo=bat&amp;logoColor=white" class="inline-block mx-1" style="margin: 0px 2px;">
<img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-7F52FF.svg?style=flat&amp;logo=Kotlin&amp;logoColor=white" class="inline-block mx-1" style="margin: 0px 2px;">
</div>
<br>
<hr>
<h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">İçindekiler</font></font></h2>
<ul class="list-disc pl-4 my-0">
<li class="my-0"><a href="#overview"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Genel bakış</font></font></a></li>
<li class="my-0"><a href="#getting-started"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Başlarken</font></font></a>
<ul class="list-disc pl-4 my-0">
<li class="my-0"><a href="#prerequisites"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Ön koşullar</font></font></a></li>
<li class="my-0"><a href="#installation"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kurulum</font></font></a></li>
<li class="my-0"><a href="#usage"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kullanım</font></font></a></li>
<li class="my-0"><a href="#testing"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Test</font></font></a></li>
</ul>
</li>
</ul>
<hr>
<h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Genel bakış</font></font></h2>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kotlin-Example, geliştirme iş akışınızı kolaylaştırmak için tasarlanmış kapsamlı bir Android proje şablonudur. Yapı yapılandırması, bağımlılık yönetimi ve modüler mimarideki en iyi uygulamaları sergiler ve bu da onu hem öğrenme hem de hızlı geliştirme için ideal hale getirir.</font></font></p>
<p><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Neden Kotlin-Örneği?</font></font></strong></p>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Bu proje, merkezi yapı betikleri, bağımlılık depoları ve temel bileşenlerle iyi yapılandırılmış bir kurulum sağlayarak Android uygulama geliştirmeyi basitleştirir. Temel özellikler şunları içerir:</font></font></p>
<ul class="list-disc pl-4 my-0">
<li class="my-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">🛠️ </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Yapı Otomasyonu:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Tutarlı proje kurulumu için merkezi Kotlin tabanlı Gradle betikleri</font></font></li>
<li class="my-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">🚀 </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Android Optimizasyonu:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Sorunsuz dağıtım için SDK yapılandırmaları, ProGuard kuralları ve bildirim yönetimi</font></font></li>
<li class="my-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">🎨 </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">UI Bileşenleri:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Gelişmiş kullanıcı deneyimi için kullanıma hazır iletişim kutuları, gezinme ve kullanıcı verisi işleme</font></font></li>
<li class="my-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">🔍 </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Test Çerçevesi:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Kod güvenilirliğini sağlamak için yerleşik birim ve araçlandırılmış testler</font></font></li>
<li class="my-0"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">🔗 </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Modüler Mimari:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Ölçeklenebilir geliştirmeyi destekleyen özel bileşenlerle endişelerin net bir şekilde ayrılması</font></font></li>
</ul>
<hr>
<h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Başlarken</font></font></h2>
<h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Ön koşullar</font></font></h3>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Bu proje aşağıdaki bağımlılıkları gerektirir:</font></font></p>
<ul class="list-disc pl-4 my-0">
<li class="my-0"><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Programlama Dili:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Kotlin</font></font></li>
<li class="my-0"><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Paket Yöneticisi:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> Gradle</font></font></li>
</ul>
<h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kurulum</font></font></h3>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kotlin-Example'ı kaynaktan derleyin ve bağımlılıkları yükleyin:</font></font></p>
<ol>
<li class="my-0">
<p><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Depoyu klonlayın:</font></font></strong></p>
<pre><code class="language-sh">❯ git clone https://github.com/AliBasboga/Kotlin-Example
</code></pre>
</li>
<li class="my-0">
<p><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Proje dizinine gidin:</font></font></strong></p>
<pre><code class="language-sh">❯ cd Kotlin-Example
</code></pre>
</li>
<li class="my-0">
<p><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Bağımlılıkları kurun:</font></font></strong></p>
</li>
</ol>
<p><strong><font style="vertical-align: inherit;"></font><a href="https://kotlinlang.org/"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Gradle</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> kullanımı </font><font style="vertical-align: inherit;">:</font></font></strong></p>
<pre><code class="language-sh">❯ gradle build
</code></pre>
<h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kullanım</font></font></h3>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Projeyi şu şekilde çalıştırın:</font></font></p>
<p><strong><font style="vertical-align: inherit;"></font><a href="https://kotlinlang.org/"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Gradle</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> kullanımı </font><font style="vertical-align: inherit;">:</font></font></strong></p>
<pre><code class="language-sh">gradle run
</code></pre>
<h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Test</font></font></h3>
<p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Kotlin örneği { </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">test_framework</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> } test çerçevesini kullanır. Test paketini şu şekilde çalıştırın:</font></font></p>
<p><strong><font style="vertical-align: inherit;"></font><a href="https://kotlinlang.org/"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Gradle</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> kullanımı </font><font style="vertical-align: inherit;">:</font></font></strong></p>
<pre><code class="language-sh">gradle test
</code></pre>
<hr>
<hr></div></div></div></div>

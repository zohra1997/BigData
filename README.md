---


---

<h1 id="big-data">Big Data</h1>
<p>This repository includes a Zeppelin notebook, which I have used to process a csv file and run some HiveQL analytics using hadoop cluster.</p>
<h2 id="project-description">Project Description</h2>
<p>This project is about processing stock quotes from different companies, countries and years  which is stored in a csv file.</p>
<ul>
<li>I have used row format delimited serde to create tables</li>
<li>To solve the problem with csv format, I  have used opencsv serde.</li>
<li>I have run some data analytics such as insert, delete, select and count.</li>
<li>To optimize the query execution time I have partitioned the data based on countries.</li>
</ul>


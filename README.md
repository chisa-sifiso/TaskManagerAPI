
<body>

<h1>📋 TaskManagerAPI</h1>
<p>A simple REST API built with Spring Boot and H2 Database for managing tasks in a to-do application. This application supports CRUD operations on tasks.</p>

<h2>📋 Features</h2>
<ul>
  <li>Retrieve all tasks</li>
  <li>Retrieve a task by ID</li>
  <li>Add a new task</li>
  <li>Update an existing task</li>
  <li>Delete a task</li>
</ul>

<h2>🛠️ Setup Instructions</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 17 or higher</li>
  <li>IntelliJ IDEA or any preferred Java IDE</li>
  <li>Postman or any API testing tool</li>
</ul>

<h3>Steps to Run</h3>
<ol>
 
  <li>Open the project in IntelliJ IDEA.</li>
  <li>Run the application.</li>
  <li>Access the API at <code>http://localhost:8080/api/tasks</code>.</li>
</ol>

<h2>📚 API Endpoints</h2>

<h3>Get All Tasks</h3>
<pre><code>GET /api/tasks</code></pre>
<p>Retrieve a list of all tasks.</p>

<h3>Get Task by ID</h3>
<pre><code>GET /api/tasks/{id}</code></pre>
<p>Retrieve a task by its ID.</p>

<h3>Add a New Task</h3>
<pre><code>POST /api/tasks</code></pre>
<p>Add a new task with a JSON body.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "title": "Complete Spring Boot tutorial",
  "description": "Learn how to create REST APIs with Spring Boot",
  "status": "Pending",
  "dueDate": "2023-12-31"
}</code></pre>

<h3>Update an Existing Task</h3>
<pre><code>PUT /api/tasks/{id}</code></pre>
<p>Update a task's details by ID.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "title": "Complete Spring Boot tutorial",
  "description": "Learn how to create REST APIs with Spring Boot",
  "status": "Completed",
  "dueDate": "2023-12-31"
}</code></pre>

<h3>Delete a Task</h3>
<pre><code>DELETE /api/tasks/{id}</code></pre>
<p>Delete a task by its ID.</p>

<h2>📂 Project Structure</h2>
<ul>
  <li><code>model/</code> - Contains the entity classes</li>
  <li><code>repository/</code> - Contains the JPA repository interfaces</li>
  <li><code>service/</code> - Contains the service layer for business logic</li>
  <li><code>controller/</code> - Contains the REST controller classes</li>
</ul>

<h2>🔗 H2 Database Console</h2>
<p>The application uses an in-memory H2 database. You can access the H2 database console at <code>http://localhost:8080/h2-console</code> to view the data.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>

<!DOCTYPE html>
<html lang="en">

<body>

  <h1>Fawry‑Challenge E‑commerce Project</h1>
  <h2>📦 Overview</h2>
  <p>This project is an e‑commerce application developed as part of the Fawry coding challenge. It integrates an online shopping frontend with Fawry’s payment gateway, providing a full checkout flow, product catalog, and user management.</p>

  <h2>🛠️ Features</h2>
  <ul>
    <li>Product listing with categories, images, price filters</li>
    <li>Shopping cart and checkout interface</li>
    <li>Integration with Fawry payment gateway for online payment</li>
    <li>User authentication (register/login/logout), user profile</li>
    <li>Admin dashboard for managing products and orders</li>
    <li>Mobile-responsive and accessible UI</li>
  </ul>

<h2>🖼️ Project Screenshot</h2>
<p>Below is a screenshot of the application running:</p>
<img src="image.png" alt="BookStore Java Application Running" width="700">

  <h2>🚀 Quick Start</h2>
  <ol>
    <li>Clone the repo:<br>
        <code>git clone https://github.com/DuaA-A/Fawry-Challenge.git</code></li>
    <li>Install dependencies:<br>
        <code>npm install</code> or <code>yarn install</code></li>
    <li>Configure environment variables:<br>
        <code>.env</code> (copy from <code>.env.example</code>) and add your Fawry credentials</li>
    <li>Start the development server:<br>
        <code>npm start</code> or <code>yarn start</code></li>
    <li>Build for production:<br>
        <code>npm run build</code> or <code>yarn build</code></li>
  </ol>

  <h2>⚙️ Configuration</h2>
  <p>Create a <code>.env</code> file with entries similar to:</p>
  <pre><code>REACT_APP_API_URL=https://api.example.com
REACT_APP_FAWRY_MERCHANT_CODE=YOUR_MERCHANT_CODE
REACT_APP_FAWRY_MERCHANT_KEY=YOUR_MERCHANT_KEY
</code></pre>

  <h2>📚 Project Structure</h2>
  <ul>
    <li><code>src/</code> – Main source code</li>
    <li><code>src/components/</code> – Reusable UI components</li>
    <li><code>src/pages/</code> – Page-level views (Home, Product, Cart, Checkout)</li>
    <li><code>src/api/</code> – API service wrappers</li>
    <li><code>src/utils/</code> – Helper functions</li>
    <li><code>src/styles/</code> – Global and theme styles</li>
  </ul>

  <h2>🧪 Testing</h2>
  <p>Run the test suite:</p>
  <pre><code>npm test</code></pre>
  <p>Coverage reports are available under <code>coverage/</code> after tests complete.</p>

  <h2>🚧 Deployment</h2>
  <p>For production, build the app and deploy the <code>build/</code> folder to any static hosting (e.g. Netlify, Vercel, GitHub Pages).</p>

  <h2>🔧 Tech Stack</h2>
  <ul>
    <li>Frontend: React, React Router</li>
    <li>State Management: Redux or Context API</li>
    <li>UI: CSS Modules or Styled Components</li>
    <li>HTTP: Axios</li>
    <li>Payment: Fawry payment gateway</li>
  </ul>

  <h2>👥 Contributing</h2>
  <p>Contributions are welcome! To contribute:</p>
  <ol>
    <li>Fork the project</li>
    <li>Create a feature branch</li>
    <li>Commit changes with clear messages</li>
    <li>Push and open a Pull Request</li>
    <li>Ensure tests pass and CI is green</li>
  </ol>
  
  <h2>🙏 Acknowledgements</h2>
  <ul>
    <li>Fawry for the payment gateway</li>
    <li>Open‑source community libraries and tools</li>
  </ul>

</body>
</html>

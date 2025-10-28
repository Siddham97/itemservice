1. Run this application to add and fetch item details.

2. Run command: mvn clean install

3. cURL to upload Item Details to h2 for testing:

curl --location 'http://localhost:9090/api/items/add' \
--header 'Content-Type: application/json' \
--data '[
  { "name": "Laptop", "description": "High performance laptop", "image": "https://via.placeholder.com/150", "price": 999.99 },
  { "name": "Smartphone", "description": "Latest model smartphone", "image": "https://via.placeholder.com/150", "price": 799.99 },
  { "name": "Headphones", "description": "Noise-cancelling headphones", "image": "https://via.placeholder.com/150", "price": 199.99 },
  { "name": "Bluetooth Speaker", "description": "Portable speaker", "image": "https://via.placeholder.com/150", "price": 59.99 },
  { "name": "Keyboard", "description": "Mechanical keyboard", "image": "https://via.placeholder.com/150", "price": 89.99 },
  { "name": "Mouse", "description": "Ergonomic mouse", "image": "https://via.placeholder.com/150", "price": 49.99 },
  { "name": "Monitor", "description": "4K UHD monitor", "image": "https://via.placeholder.com/150", "price": 299.99 },
  { "name": "Webcam", "description": "1080p HD webcam", "image": "https://via.placeholder.com/150", "price": 69.99 },
  { "name": "USB Hub", "description": "Multiport USB hub", "image": "https://via.placeholder.com/150", "price": 25.99 },
  { "name": "External Hard Drive", "description": "2TB external drive", "image": "https://via.placeholder.com/150", "price": 109.99 },
  { "name": "Desk Lamp", "description": "LED desk lamp", "image": "https://via.placeholder.com/150", "price": 39.99 },
  { "name": "Chair", "description": "Ergonomic office chair", "image": "https://via.placeholder.com/150", "price": 149.99 },
  { "name": "Backpack", "description": "Laptop backpack", "image": "https://via.placeholder.com/150", "price": 59.99 },
  { "name": "Power Bank", "description": "10000mAh portable charger", "image": "https://via.placeholder.com/150", "price": 29.99 },
  { "name": "Smart Watch", "description": "Fitness tracker smartwatch", "image": "https://via.placeholder.com/150", "price": 199.99 },
  { "name": "Tablet", "description": "Android tablet", "image": "https://via.placeholder.com/150", "price": 249.99 },
  { "name": "Stylus Pen", "description": "Pen for tablet", "image": "https://via.placeholder.com/150", "price": 19.99 },
  { "name": "Portable Fan", "description": "USB mini fan", "image": "https://via.placeholder.com/150", "price": 12.99 },
  { "name": "Router", "description": "Dual band Wi-Fi router", "image": "https://via.placeholder.com/150", "price": 79.99 },
  { "name": "HDMI Cable", "description": "6ft HDMI cable", "image": "https://via.placeholder.com/150", "price": 9.99 },
  { "name": "Wireless Charger", "description": "Fast charging pad", "image": "https://via.placeholder.com/150", "price": 29.99 },
  { "name": "Camera", "description": "Mirrorless digital camera", "image": "https://via.placeholder.com/150", "price": 699.99 },
  { "name": "Tripod", "description": "Lightweight camera tripod", "image": "https://via.placeholder.com/150", "price": 49.99 },
  { "name": "Gaming Console", "description": "Next-gen gaming console", "image": "https://via.placeholder.com/150", "price": 499.99 },
  { "name": "Game Controller", "description": "Wireless game controller", "image": "https://via.placeholder.com/150", "price": 59.99 },
  { "name": "TV", "description": "55-inch smart TV", "image": "https://via.placeholder.com/150", "price": 599.99 },
  { "name": "Streaming Stick", "description": "4K streaming device", "image": "https://via.placeholder.com/150", "price": 39.99 },
  { "name": "Coffee Maker", "description": "Drip coffee machine", "image": "https://via.placeholder.com/150", "price": 89.99 },
  { "name": "Blender", "description": "Kitchen blender", "image": "https://via.placeholder.com/150", "price": 49.99 },
  { "name": "Air Fryer", "description": "Compact air fryer", "image": "https://via.placeholder.com/150", "price": 99.99 },
  { "name": "Toaster", "description": "2-slice toaster", "image": "https://via.placeholder.com/150", "price": 24.99 },
  { "name": "Water Bottle", "description": "Stainless steel bottle", "image": "https://via.placeholder.com/150", "price": 14.99 },
  { "name": "Notebook", "description": "Hardcover notebook", "image": "https://via.placeholder.com/150", "price": 6.99 },
  { "name": "Pen Set", "description": "Fine tip pens", "image": "https://via.placeholder.com/150", "price": 11.99 },
  { "name": "Planner", "description": "2025 daily planner", "image": "https://via.placeholder.com/150", "price": 19.99 },
  { "name": "Yoga Mat", "description": "Non-slip yoga mat", "image": "https://via.placeholder.com/150", "price": 39.99 },
  { "name": "Resistance Bands", "description": "Fitness bands set", "image": "https://via.placeholder.com/150", "price": 22.99 },
  { "name": "Dumbbells", "description": "Adjustable dumbbell pair", "image": "https://via.placeholder.com/150", "price": 89.99 },
  { "name": "Jump Rope", "description": "Speed jump rope", "image": "https://via.placeholder.com/150", "price": 9.99 },
  { "name": "Book Light", "description": "Clip-on reading light", "image": "https://via.placeholder.com/150", "price": 15.99 },
  { "name": "Extension Cord", "description": "6-outlet power strip", "image": "https://via.placeholder.com/150", "price": 13.99 },
  { "name": "Laundry Basket", "description": "Foldable laundry bin", "image": "https://via.placeholder.com/150", "price": 18.99 },
  { "name": "Wall Clock", "description": "Minimalist wall clock", "image": "https://via.placeholder.com/150", "price": 29.99 },
  { "name": "Shoe Rack", "description": "3-tier shoe organizer", "image": "https://via.placeholder.com/150", "price": 44.99 },
  { "name": "Floor Mat", "description": "Anti-slip floor mat", "image": "https://via.placeholder.com/150", "price": 27.99 },
  { "name": "Curtains", "description": "Blackout window curtains", "image": "https://via.placeholder.com/150", "price": 54.99 },
  { "name": "Mirror", "description": "Full-length mirror", "image": "https://via.placeholder.com/150", "price": 69.99 },
  { "name": "Wall Art", "description": "Abstract canvas painting", "image": "https://via.placeholder.com/150", "price": 39.99 },
  { "name": "Plant Pot", "description": "Ceramic indoor planter", "image": "https://via.placeholder.com/150", "price": 17.99 }
]
'


## Implementation of air purifier
- __Instance variables :__
  - __model :__ ชื่อ model
  - __serial_no :__ เลข serial number
  - __room_size :__ ขนาดของห้องที่ออกแบบไว้(ลบ.ม.)
  - __filter_type :__ ชนิดของ filter
  - __sensor_type :__ ชนิดของ sensor
  - __monitor_type :__ ชนิดของ monitor
  - __powered_on :__ สถาณะของเครื่องฟอกอากาศ (On/Off)
####
- __Instance methods :__
  - __turn_on() :__ เปิดเครื่องฟอกอากาศ
  - __turn_off() :__ ปิดเครื่องฟอกอากาศ
  - __is_powered_on() :__ เช็คเครื่องฟอกอากาศว่ากำลังเปิดอยู่หรือไม่
####
- __Class variable :__
  - __manufacturer :__ ชื่อผู้ผลิตของเครื่องฟอกอากาศในทุก instances
####
- __Class method :__

  - __set_default_manufacturer(new_manufacturer) :__ set ชื่อผู้ผลิตของเครื่องฟอกอากาศใหม่ในทุก instances
####
- __Overview methods :__

  - __turn_on() :__
      - Input : ไม่มี
      - Computation :
        - เช็คว่า เครื่องฟอกอากาศ กำลังปิดอยู่หรือไม่
        - ถ้ากำลังปิดอยู่ จะทำการ print ข้อความว่าทำการเปิดเครื่องฟอกอากาศ และ set ให้ powered_on = true
        - แต่ หากเครื่องฟอกอากาศกำลังเปิดอยู่ ให้ print ข้อความบอกว่าเครื่องฟอกอากาศเครื่องนี้เปิดอยู่แล้ว
      - Return : ไม่มี
    ####
  - __turn_off() :__
      - Input: ไม่มี
      - Computation:
        - เช็คว่า เครื่องฟอกอากาศ กำลังเปิดอยู่หรือไม่
        - ถ้ากำลังเปิดอยู่ จะทำการ print ข้อความว่าทำการปิดเครื่องฟอกอากาศ และ set ให้ powered_on = false
        - แต่ หากเครื่องฟอกอากาศกำลังปิดอยู่ ให้ print ข้อความบอกว่าเครื่องฟอกอากาศเครื่องนี้ปิดอยู่แล้ว
      - Return: ไม่มี
    ####
  - __is_powered_on() :__
    - Input: ไม่มี
    - Computation: 
      - return ค่าของ boolean powered_on ของ instance นี้ว่าเปิดอยู่หรือไม่
    - Return: ค่า boolean powered_on(true เมื่อเปิด, false เมื่อปิด)
    ####
  - __set_default_manufacturer(new_manufacturer) :__
    - Input: new_manufacturer ชื่อของผู้ผลิตที่จะทำการ set ไปทุก instances ของ class
    - Computation:
      - set ค่า class variable manufacturer เป็นค่าของ new_manufacturer
      - print ข้อความว่าเปลี่ยน manufacturer เป็น new_manufacturer แล้ว
    - Return: ค่า boolean (true เมื่อเปิด, false เมื่อปิด)
